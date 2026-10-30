// SPDX-License-Identifier: AGPL-3.0-only
// UI copy and visual language adapted from DiAuto. See docs/THIRD_PARTY_NOTICES.md.
package net.easyconn.gwmec

import net.easyconn.gwmec.update.UpdateVersion
import android.Manifest
import android.app.AlertDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.view.Window
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.media.AudioFormat
import android.media.AudioTrack
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.util.Log
import android.view.Gravity
import android.widget.ImageView
import android.view.KeyEvent
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.FileProvider
import androidx.core.widget.doAfterTextChanged
import androidx.core.view.doOnLayout
import androidx.core.view.WindowCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import net.easyconn.gwmec.adb.LocalAdb
import net.easyconn.gwmec.airplay.CarPlayClusterDisplay
import net.easyconn.gwmec.carlife.CarLifeCenter
import net.easyconn.gwmec.carlife.CarLifeDiscovery
import net.easyconn.gwmec.carlife.CarLifeVideoActivity
import net.easyconn.gwmec.airplay.CarPlayDisplayScale
import net.easyconn.gwmec.airplay.ClusterTurnCardOverlay
import net.easyconn.gwmec.compat.closeCompat
import net.easyconn.gwmec.hud.BydAdbAccess
import net.easyconn.gwmec.hud.BydNavigationOutputs
import net.easyconn.gwmec.hud.BydFieldSource
import net.easyconn.gwmec.hud.BydOutputSettings
import net.easyconn.gwmec.hud.BydVehicleCapabilities
import net.easyconn.gwmec.hud.BydVehicleField
import net.easyconn.gwmec.hud.BydVehicleFieldStore
import net.easyconn.gwmec.hud.BydVehicleProbeOutcome
import net.easyconn.gwmec.host.R
import net.easyconn.gwmec.media.AmbientColorMode
import net.easyconn.gwmec.media.AmbientColorSpeed
import net.easyconn.gwmec.media.AmbientMusicController
import net.easyconn.gwmec.media.AmbientColorSource
import net.easyconn.gwmec.media.AmbientMusicSettings
import net.easyconn.gwmec.network.CarHotspotSettings
import net.easyconn.gwmec.network.CarHotspotTethering
import net.easyconn.gwmec.network.WifiP2pChannels
import net.easyconn.gwmec.orchestration.ManualHotspotSecurity
import net.easyconn.gwmec.orchestration.WirelessHotspotMode
import net.easyconn.gwmec.settings.SettingsTheme
import net.easyconn.gwmec.settings.SettingsWidgets
import net.easyconn.gwmec.setup.DiLinkGeneration
import net.easyconn.gwmec.setup.SetupGuide
import net.easyconn.gwmec.transport.EvChargingConnectors
import net.easyconn.gwmec.update.BackgroundUpdateScheduler
import net.easyconn.gwmec.update.UpdateApkExport
import net.easyconn.gwmec.update.UpdateAvailability
import net.easyconn.gwmec.update.UpdateMirror
import net.easyconn.gwmec.update.UpdateCatalog
import net.easyconn.gwmec.update.UpdateChecksums
import net.easyconn.gwmec.update.UpdateClient
import net.easyconn.gwmec.update.UpdateRelease
import net.easyconn.gwmec.update.UpdateReleaseLookup
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.math.roundToInt

internal enum class SettingsCategory {
    OVERVIEW, CONNECTION, DISPLAY, AUDIO, NAVIGATION, VEHICLE, LANGUAGE, ABOUT, DIAGNOSTICS, ADVANCED,
}

/** A settings card. Every entry needs one category in [SettingsInformationArchitecture]; see AGENTS.md. */
internal enum class SettingsSection {
    CARPLAY_CONTROLS,
    WHEEL_KEYS,
    CONNECTION_SETUP,
    DIAGNOSTICS,
    AUTOMATIC_CONNECTION,
    USB_CONNECTION,
    BYD_ADB,
    DISPLAY_AND_PERFORMANCE,
    EXPERIMENTAL_DISPLAY,
    ADVANCED_MEDIA,
    AMBIENT_LIGHTING,
    CAR_BUTTON,
    AUDIO_ROUTING,
    CARPLAY_VIDEO,
    NAVIGATION_WHEEL,
    LOCATION,
    LAUNCHER_BUBBLE,
    PERMISSIONS_AND_HELP,
    LANGUAGE,
}

internal object SettingsInformationArchitecture {
    val sectionsByCategory: Map<SettingsCategory, Set<SettingsSection>> = mapOf(
        SettingsCategory.OVERVIEW to emptySet(),
        SettingsCategory.LANGUAGE to setOf(SettingsSection.LANGUAGE),
        SettingsCategory.ABOUT to emptySet(),
        SettingsCategory.CONNECTION to setOf(
            SettingsSection.CONNECTION_SETUP,
            SettingsSection.AUTOMATIC_CONNECTION,
            SettingsSection.USB_CONNECTION,
            SettingsSection.BYD_ADB,
            SettingsSection.PERMISSIONS_AND_HELP,
        ),
        SettingsCategory.DISPLAY to setOf(SettingsSection.DISPLAY_AND_PERFORMANCE, SettingsSection.LAUNCHER_BUBBLE),
        SettingsCategory.AUDIO to setOf(SettingsSection.AUDIO_ROUTING, SettingsSection.CARPLAY_VIDEO),
        SettingsCategory.NAVIGATION to setOf(SettingsSection.LOCATION),
        SettingsCategory.VEHICLE to setOf(
            SettingsSection.CARPLAY_CONTROLS,
            SettingsSection.WHEEL_KEYS,
            SettingsSection.CAR_BUTTON,
        ),
        SettingsCategory.DIAGNOSTICS to setOf(SettingsSection.DIAGNOSTICS),
        SettingsCategory.ADVANCED to setOf(
            SettingsSection.EXPERIMENTAL_DISPLAY,
            SettingsSection.ADVANCED_MEDIA,
            SettingsSection.NAVIGATION_WHEEL,
            SettingsSection.AMBIENT_LIGHTING,
        ),
    )
}

/** DiAuto's visual language, with a connection flow for an independent CarPlay receiver. */
class CarlinkActivity : ComponentActivity(), AppAppearanceOwner {
    private val handler = Handler(Looper.getMainLooper())
    private var appNight = true
    override val currentAppNight: Boolean get() = appNight
    private var palette = CarlinkPalette.DARK
    private var appearanceObserverRemoval: (() -> Unit)? = null
    private var appearanceUpdatesResumed = false
    private var appearanceRenderPending = false
    private var appearanceButtonFocusPending = false
    private var windowLearning: WindowKeyLearning? = null
    private val windowLearningPresses = WheelKeyPresses()
    private val endWindowLearning = Runnable { cancelKeyLearning() }
    private var page = "home"
    internal var ambientSupportCheck: (Context) -> java.util.concurrent.CompletableFuture<Boolean> = AmbientMusicController::checkSupport
    private var settingsCategory = SettingsCategory.OVERVIEW
    private var connectionSettingsReturnCategory: SettingsCategory? = null
    private var setupStep = SetupGuide.STEP_CAR
    private var setupFromSettings = false
    private var settingsSectionFilter: Set<SettingsSection>? = null
    private var clusterSafeAreaDialog: Dialog? = null
    private var clusterContentRequestVersion = 0L
    private var pendingCarHotspotSetup = false
    private var hotspotJoinControls: HotspotJoinControls? = null
    private var setupError: String? = null
    /** Set when a connection attempt failed because the chosen iPhone was absent / offline. */
    private var phoneAbsentHint: String? = null
    private var status: TextView? = null
    private var connectButton: android.widget.TextView? = null
    private var disconnectButton: android.widget.TextView? = null
    private var lastRunning: Boolean? = null
    private var lastHomeState: HomeState = HomeState.IDLE
    /**
     * Whether the home already led into the picture for this connection. Remembered
     * across restarts: the home leads once, when a connection starts here and comes
     * up. After that the driver decides — returning, or launching the home again,
     * stays on the home. Only a new connection here arms the handover again.
     */
    private fun projectionHandled(): Boolean =
        getSharedPreferences("diplay", MODE_PRIVATE).getBoolean("projection_handled", false)

    private fun setProjectionHandled(handled: Boolean) {
        getSharedPreferences("diplay", MODE_PRIVATE).edit().putBoolean("projection_handled", handled).apply()
    }

    /**
     * True once the home has already led into the picture for this run of the app. The
     * driver's choice is "only the first successful connection brings me in": later
     * connections in the same run stay on the home, and a fresh start arms it again.
     */
    private var autoEnterUsedThisRun = false

    private fun armProjectionHandover() {
        // Only the first connection of this run leads in; later ones keep the home.
        setProjectionHandled(autoEnterUsedThisRun)
    }

    /**
     * Whether the picture should be brought forward. It waits for a session, not for the
     * iPhone's RECORD: the session exists as soon as the controller is stored, and by then
     * the video surface is the only place anything can appear. Waiting for RECORD kept the
     * home in front for the whole handshake, and the driver watched a black screen while a
     * connection that was already working finished talking.
     */
    private fun shouldHandToProjection(): Boolean =
        CarPlayBackgroundSession.active && page == "home" && !projectionHandled() && !disconnecting

    fun markReturnedFromProjection() { setProjectionHandled(true) }

    private var pendingWireless = false
    private var initialLaunch = true
    private var notificationTransport = true
    private var exportInProgress = false
    private var usbPermissionOperation: UsbPermissionSetup.Operation? = null
    private var usbPermissionDialog: AlertDialog? = null
    internal var usbPermissionOperationFactory: (Context) -> UsbPermissionSetup.Operation = {
        UsbPermissionSetup.Operation(it.applicationContext)
    }
    private var navigationStreamType = 14
    private var testToneTrack: AudioTrack? = null
    private var toneStop: Runnable? = null
    private var exportButton: Button? = null
    private var rootScroll: ScrollView? = null
    private var settingsRailScroll: ScrollView? = null
    private var reconnectBar: View? = null
    private var readinessCard: LinearLayout? = null
    private var searchIndexSink: MutableList<String>? = null
    private var settingsSearchBox: EditText? = null
    private var settingsSearchPopup: PopupWindow? = null
    private var settingsSearchIndex: List<SettingsSearchResult>? = null
    private var settingsSearchQuery = ""
    private var settingsSearchIndexing = false
    private var settingsSearchRestoreFocus = false
    private var renderedReadiness: SettingsReadiness? = null
    private var renderedPage: String? = null
    private var renderedSettingsCategory: SettingsCategory? = null
    private var pendingScrollY: Int? = null
    private var pendingRailScrollY: Int? = null
    private var pendingRailFocus = false
    private var bydVehicleAdvancedExpanded = false
    private var adbAccessState: BydAdbAccess.State? = null
    private var adbCheckInProgress = false
    private var adbCheckMayAsk = false
    private var adbCheckFailed = false
    private var vehicleProbeAuthorizationInProgress = false
    private var vehicleProbeInProgress = false
    private var vehicleProbeOutcome: BydVehicleProbeOutcome? = null
    private var adbCheckGeneration = 0
    private var adbStatus: TextView? = null
    private var availableUpdate: UpdateRelease? = null
    private var updateSavedPath: String? = null
    @Volatile private var updateStage = UpdateStage.IDLE
    @Volatile private var updateGeneration = 0
    @Volatile private var updateProgress: Int? = null
    private var updateRelease: UpdateRelease? = null
    private var updateFile: File? = null
    private var updateMessage: String? = null
    /** True while a download is already running, so a second tap cannot start another. */
    @Volatile private var updateDownloading = false
    private var carButtonCard: LinearLayout? = null
    private var bydAdbControls: LinearLayout? = null
    private var adbSwitchChangePending = false
    private var pausedForAdbSwitchChange = false
    private var updatingAdbSwitches = false
    private val adbSwitches = mutableMapOf<Int, Pair<Switch, () -> Boolean>>()
    private var hotspotStartupResult: CarHotspotTethering.Result? = null
    @Volatile private var startupHotspotCancelled = false
    @Volatile private var vehicleProbeGeneration = 0
    @Volatile private var vehicleValidationGeneration = 0
    private val vehicleOperationLock = Any()
    private var automaticVehicleValidationStarted = false
    private var automaticVehicleValidationInProgress = false
    private var automaticVehicleValidationPending = false
    private var pendingVehicleReplacement: BydVehicleCapabilities? = null
    // The saved snapshot [pendingVehicleReplacement] was compared with.
    private var pendingVehicleReplacementExpected: BydVehicleCapabilities? = null
    private var pendingVehicleLostFields: Set<BydVehicleField> = emptySet()
    private var defaultVehicleStatus: BydAdbAccess.Status? = null
    private var vehicleDataReconnectPending = false
    private val automaticVehicleValidation = Runnable {
        automaticVehicleValidationPending = false
        validateSavedVehicleConfigurationAutomatically()
    }
    private data class VehicleProbeAttempt(
        val outcome: BydVehicleProbeOutcome,
        val heldCandidate: BydVehicleCapabilities? = null,
        val lostFields: Set<BydVehicleField> = emptySet(),
        val snapshotChanged: Boolean = false,
        val allowedOnlyOnce: Boolean = false,
    )

    private data class VehicleValidationAttempt(
        val status: BydAdbAccess.Status,
        val outcome: BydVehicleProbeOutcome? = null,
        val heldCandidate: BydVehicleCapabilities? = null,
        val lostFields: Set<BydVehicleField> = emptySet(),
        val snapshotChanged: Boolean = false,
        val savedFieldsReadable: Boolean = false,
    )
    private val notificationPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
        connect(notificationTransport)
    }
    private val tick = object : Runnable {
        override fun run() {
            refreshStatus()
            // The link came up while the home held the wait; bring the picture forward now.
            if (shouldHandToProjection()) {
                autoEnterUsedThisRun = true
                setProjectionHandled(true)
                openProjection()
            }
            handler.postDelayed(this, 1000)
        }
    }
    private val appearancePoll = object : Runnable {
        override fun run() {
            checkForAppearanceChange()
            if (appearanceUpdatesResumed) handler.postDelayed(this, APPEARANCE_POLL_MILLIS)
        }
    }
    private val bluetoothPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        if (granted) choosePhone() else permissionHelp(getString(R.string.nearby_devices), getString(R.string.allow_nearby_devices_so_diplay_can_connect_to_your_paired))
    }
    private val bluetoothAutoConnectPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        if (granted) {
            if (CarlinkPreferences.phoneAddress(this) == null) choosePhone()
        } else {
            CarlinkPreferences.saveConnectOnPhoneBluetooth(this, false)
            render()
            permissionHelp(getString(R.string.nearby_devices), getString(R.string.allow_nearby_devices_so_diplay_can_connect_to_your_paired))
        }
    }
    private val locationPermission = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {
        if (hasPreciseLocation()) {
            applyLocationReporting(true)
        } else {
            render()
            permissionHelp(getString(R.string.location), getString(R.string.allow_precise_location_for_diplay_in_the_head_unit_s_app_p))
        }
    }
    private val iconPicker = registerForActivityResult(ActivityResultContracts.GetContent(), ::cropIcon)
    private val iconDocumentPicker = registerForActivityResult(ActivityResultContracts.OpenDocument(), ::cropIcon)
    private fun cropIcon(uri: Uri?) {
        if (uri != null) iconCrop.launch(Intent(this, ImageCropActivity::class.java).setData(uri).addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION))
    }
    private val iconCrop = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode != RESULT_OK) return@registerForActivityResult
        refreshCarButton()
        carButtonSaved()
    }
    private val export = registerForActivityResult(ActivityResultContracts.CreateDocument("text/plain")) { uri ->
        if (uri != null) exportDiagnostics(uri)
    }
    // Android 9: storage access puts the report in the visible Downloads/Carlink folder.
    // A denial still saves the report, only in Carlink's own storage.
    private val reportStoragePermission = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
        exportDiagnostics()
    }

    private var languagePreferenceAtCreate = AppLocale.SYSTEM

    private var interfaceOverride: Configuration? = null
    private var interfaceSystemDensityDpi = 0
    private var interfaceRecreateRequested = false

    private fun enforceInterfaceSize(): Boolean {
        val language = AppLocale.enforce(this)
        if (language) android.util.Log.i("CarlinkUi", "app language re-applied")
        val override = interfaceOverride ?: return language
        val found = resources.displayMetrics.densityDpi
        if (!InterfaceSize.enforce(resources, override)) return language
        android.util.Log.i("CarlinkUi", "interface size re-applied: $found -> ${override.densityDpi} dpi")
        return true
    }

    override fun attachBaseContext(newBase: Context) {
        val base = AppLocale.wrap(newBase)
        super.attachBaseContext(base)
        interfaceSystemDensityDpi = base.resources.configuration.densityDpi
        interfaceOverride = InterfaceSize.attach(this, base)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 上游 CarLife 的音频/工具类通过静态 Context 取系统服务，先把宿主绑上。
        com.baidu.carlifevehicle.BaseActivity.bind(this)
        // A crash is the one thing a driver cannot describe from a car; the diagnostic
        // report is where it can be read without adb.
        LastCrashReport.bind(this)
        LastCrashReport.install()
        CrashRecord.install(this)
        // 插拔数据线时刷新主页的有线连接入口。
        registerReceiver(usbStateReceiver, android.content.IntentFilter(android.hardware.usb.UsbManager.ACTION_USB_DEVICE_ATTACHED).apply {
            addAction(android.hardware.usb.UsbManager.ACTION_USB_DEVICE_DETACHED)
        })
        // Back on the home page finishes this activity while the session runs on, so the icon lands here.
        if (savedInstanceState == null && isLauncherIntent(intent) && CarPlayBackgroundSession.active) {
            openProjection(); finish(); return
        }
        scheduleBackgroundUpdateChecks()
        clearStaleUpdateCache()
        availableUpdate = UpdateAvailability.available(this, version())
        enforceInterfaceSize()
        refreshAppearance()
        rememberLaunchAppearance()
        languagePreferenceAtCreate = AppLocale.preference(this)
        net.easyconn.gwmec.hud.BydNavigationOutputs.onAppOpened(applicationContext)
        WheelKeyService.restoreIfNeeded(this)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        if (Build.VERSION.SDK_INT >= 28) {
            window.attributes = window.attributes.apply {
                layoutInDisplayCutoutMode = android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
            }
        }
        applyWindowAppearance()
        setupError = runCatching { CarlinkBootstrap.ensure(this, AirPlayPersistence.loadMfiTarget(this)) }.exceptionOrNull()?.let {
            android.util.Log.e("CarlinkSetup", "CarPlay authentication could not be loaded", it)
            getString(R.string.setup_error_auth)
        }
        pendingCarHotspotSetup = savedInstanceState?.getBoolean("pending_car_hotspot") ?: false
        bydVehicleAdvancedExpanded = savedInstanceState?.getBoolean("byd_vehicle_advanced") ?: false
        settingsCategory = savedInstanceState?.getString("settings_category")
            ?.let { runCatching { SettingsCategory.valueOf(it) }.getOrNull() }
            ?: SettingsCategory.OVERVIEW
        connectionSettingsReturnCategory = savedInstanceState?.getString("connection_settings_return_category")
            ?.let { runCatching { SettingsCategory.valueOf(it) }.getOrNull() }
        setupStep = savedInstanceState?.getInt("setup_step") ?: SetupGuide.STEP_CAR
        setupFromSettings = savedInstanceState?.getBoolean("setup_from_settings") ?: false
        page = savedInstanceState?.getString("page") ?: intent.getStringExtra("page")
            ?: if (setupError == null && SetupGuide.shouldOpenOnLaunch(SetupGuide.seen(this),
                    CarlinkPreferences.phoneAddress(this) != null)) "setup" else "home"
        render()
        scheduleAutomaticVehicleValidation()
        handleWirelessRecovery()
        if (consumeBluetoothAutoConnectIntent(intent)) {
            if (initialLaunch) {
                initialLaunch = false
                startCarHotspotOnLaunch()
            }
            handler.post { connect(true) }
        }
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (page != "home") navigateBack()
                else { isEnabled = false; onBackPressedDispatcher.onBackPressed(); isEnabled = true }
            }
        })
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent); setIntent(intent)
        connectionSettingsReturnCategory = null
        // CarPlay runs in its own task, so the launcher icon resumes this one. Settings opened from
        // CarPlay carry a "page" extra, which isLauncherIntent rejects.
        if (isLauncherIntent(intent) && CarPlayBackgroundSession.active) {
            page = "home"; render(); openProjection(); return
        }
        page = intent.getStringExtra("page") ?: "home"; render()
        automaticVehicleValidationStarted = false
        scheduleAutomaticVehicleValidation()
        handleWirelessRecovery()
        if (consumeBluetoothAutoConnectIntent(intent)) {
            if (initialLaunch) {
                initialLaunch = false
                startCarHotspotOnLaunch()
            }
            handler.post { connect(true) }
        }
    }
    private fun consumeBluetoothAutoConnectIntent(intent: Intent): Boolean {
        val requested = intent.getBooleanExtra(PhoneBluetoothReceiver.EXTRA_AUTO_CONNECT, false)
        intent.removeExtra(PhoneBluetoothReceiver.EXTRA_AUTO_CONNECT)
        return requested && CarlinkPreferences.connectOnPhoneBluetooth(this) &&
            CarlinkPreferences.phoneAddress(this) != null && setupError == null &&
            !CarPlayBackgroundSession.hasSession()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("page", page)
        outState.putString("settings_category", settingsCategory.name)
        connectionSettingsReturnCategory?.let { outState.putString("connection_settings_return_category", it.name) }
        outState.putBoolean("pending_car_hotspot", pendingCarHotspotSetup)
        outState.putBoolean("byd_vehicle_advanced", bydVehicleAdvancedExpanded)
        outState.putInt("setup_step", setupStep)
        outState.putBoolean("setup_from_settings", setupFromSettings)
        super.onSaveInstanceState(outState)
    }
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (updateInterfaceSize(newConfig)) return
        refreshAppearance()
        render()
    }

    /** True while a density change is recreating this activity. */
    private fun updateInterfaceSize(configuration: Configuration): Boolean {
        if (interfaceRecreateRequested) return true
        // The activity handles real system density changes too. Its callback contains our installed
        // density, while application resources retain the current unscaled system density.
        applicationContext.resources.configuration.densityDpi.takeIf { it > 0 }?.let {
            interfaceSystemDensityDpi = it
        }
        val next = InterfaceSize.configurationChange(configuration, interfaceSystemDensityDpi,
            InterfaceSize.preference(this))
        if (InterfaceSize.needsRecreate(interfaceOverride, next)) {
            interfaceRecreateRequested = true
            recreate()
            return true
        }
        interfaceOverride = next
        return false
    }
    private fun openOverlayPermission() {
        val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName"))
        if (runCatching { startActivity(intent) }.isFailure) {
            android.widget.Toast.makeText(this, R.string.center_map_no_permission_screen, android.widget.Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        super.onStart()
        // Results from the image picker and crop screens arrive before onResume.
        enforceInterfaceSize()
        CenterMapOverlay.onCarlinkScreenShown()
    }

    override fun onStop() {
        cancelUsbPermissionSetup()
        clusterSafeAreaDialog?.dismiss()
        startupHotspotCancelled = true
        super.onStop()
        if (!isFinishing && !isChangingConfigurations) {
            CenterMapOverlay.scheduleShow()
            LauncherBubble.scheduleShow()
        }
    }

    override fun onResume() {
        super.onResume()
        applyFullscreenMode()
        LauncherBubble.attach(this)
        LauncherBubble.onAppScreenShown()
        // Returning from another activity can bring the head unit's own density back.
        if (enforceInterfaceSize()) render()
        if (Build.VERSION.SDK_INT < 33 && AppLocale.preference(this) != languagePreferenceAtCreate) {
            recreate()
            return
        }
        // The driver came back from the picture by their own hand: stop leading into it, so
        // returning stays a choice rather than a door that swings shut behind them.
        if (getSharedPreferences("diplay", MODE_PRIVATE).getBoolean("returned_from_projection", false)) {
            getSharedPreferences("diplay", MODE_PRIVATE).edit().remove("returned_from_projection").apply()
            markReturnedFromProjection()
        }
        watchForSession()
        // The installer is given the APK and reads it in its own time. Deleting it the
        // moment this screen came back removed the file while the installer was still
        // reading it, which the driver saw as a package that could not be parsed. The
        // cache is cleaned on a later start instead, when no install can be reading it.
        handler.removeCallbacks(tick); handler.post(tick)
        // Back from the car settings or the picture: refresh what was shown. The home
        // refills only its status box, so coming back from a connection does not rebuild
        // the page — rebuilding it there made the whole screen blink on every return,
        // including the one from a CarPlay session the driver just left.
        if (!initialLaunch && !adbSwitchChangePending && !pausedForAdbSwitchChange) {
            when (page) {
                "home" -> if (!refreshHomeStatus()) render()
                "carlife" -> refreshCarLifeStatus()
                "settings", "connection", "setup" -> render()
            }
        }
        startAppearanceUpdates()
        pausedForAdbSwitchChange = false
        if (initialLaunch) {
            initialLaunch = false
            startCarHotspotOnLaunch()
            if (setupError == null && !CarPlayBackgroundSession.hasSession() &&
                CarlinkPreferences.autoConnect(this) && intent.getStringExtra("page") == null && page != "setup") {
                handler.post { connect(CarlinkPreferences.autoConnectWireless(this)) }
            }
        }
    }
    override fun onPause() {
        appearanceUpdatesResumed = false
        appearanceObserverRemoval?.invoke()
        appearanceObserverRemoval = null
        handler.removeCallbacks(appearancePoll)
        cancelKeyLearning()
        pausedForAdbSwitchChange = adbSwitchChangePending
        handler.removeCallbacks(tick)
        super.onPause()
    }

    override fun onDestroy() {
        runCatching { unregisterReceiver(usbStateReceiver) }
        settingsSearchPopup?.dismiss()
        appearanceObserverRemoval?.invoke()
        appearanceObserverRemoval = null
        handler.removeCallbacks(appearancePoll)
        hotspotJoinControls?.close()
        cancelUsbPermissionSetup()
        cancelKeyLearning()
        handler.removeCallbacks(automaticVehicleValidation)
        adbCheckGeneration++
        synchronized(vehicleOperationLock) {
            vehicleProbeGeneration++
            vehicleValidationGeneration++
        }
        adbCheckInProgress = false
        vehicleProbeAuthorizationInProgress = false
        vehicleProbeInProgress = false
        automaticVehicleValidationInProgress = false
        super.onDestroy()
    }

    override fun onMultiWindowModeChanged(isInMultiWindowMode: Boolean, newConfig: Configuration) {
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig)
        applyFullscreenMode()
        if (updateInterfaceSize(newConfig)) return
        render()
    }

    /** What the home shows: waiting idle, a link coming up, or CarPlay running. */
    private enum class HomeState { IDLE, CONNECTING, CONNECTED, DISCONNECTING }

    private val isCompactLayout: Boolean
        // Window size only: a multi-window task can fill the whole screen, and in multi-window the
        // configuration already reports the window's own size.
        get() = resources.configuration.screenWidthDp < 550 ||
            resources.configuration.screenHeightDp < 450

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) applyFullscreenMode()
        // Some head units put their own density back without any other callback.
        if (hasFocus && enforceInterfaceSize()) render()
    }

    /**
     * Hides or shows the system bars to match the settings.
     *
     * Only the bars whose wanted state actually changed are touched. Asking for a bar
     * that is already in that state still makes the system re-lay it out, and doing that
     * on every render — which is every status update on the home — made the status bar
     * flicker while CarPlay was connecting.
     */
    private fun applyFullscreenMode() {
        val multiWindow = Build.VERSION.SDK_INT >= 24 && isInMultiWindowMode
        val hideTop = AirPlayPersistence.loadHideTopBar(this) && !multiWindow
        val hideBottom = AirPlayPersistence.loadHideBottomBar(this) && !multiWindow
        if (hideTop == fullscreenTopHidden && hideBottom == fullscreenBottomHidden) return
        fullscreenTopHidden = hideTop
        fullscreenBottomHidden = hideBottom
        WindowInsetsControllerCompat(window, window.decorView).apply {
            isAppearanceLightStatusBars = palette.systemBarIconsAreDark
            isAppearanceLightNavigationBars = palette.systemBarIconsAreDark
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            if (hideTop) hide(WindowInsetsCompat.Type.statusBars())
            else show(WindowInsetsCompat.Type.statusBars())
            if (hideBottom) hide(WindowInsetsCompat.Type.navigationBars())
            else show(WindowInsetsCompat.Type.navigationBars())
        }
        ViewCompat.requestApplyInsets(window.decorView)
    }

    /** The system bars' hidden state as this activity last asked for it. */
    private var fullscreenTopHidden = false
    private var fullscreenBottomHidden = false

    /**
     * Whether the system bars are really hidden right now, asked of the window
     * itself rather than remembered. setContentView — every render — replaces the
     * content the insets were last dispatched for, and the relayout that follows
     * can land with the bars showing before any listener runs. Re-asking the real
     * state keeps the remembered flags honest so the next applyFullscreenMode
     * actually re-hides instead of trusting a stale "already hidden".
     */
    private fun systemBarsActuallyHidden(): Pair<Boolean, Boolean> {
        val root = window.decorView
        val insets = ViewCompat.getRootWindowInsets(root) ?: return Pair(false, false)
        val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        return Pair(bars.top == 0, bars.bottom == 0)
    }

    private val isNaturallyExpandedSettingsLayout: Boolean
        get() = resources.configuration.let {
            SettingsLayoutPolicy.isExpanded(it.screenWidthDp, it.screenHeightDp, it.fontScale)
        }

    private val isExpandedSettingsLayout: Boolean
        get() = SettingsLayoutPreferences.isActive(this) || isNaturallyExpandedSettingsLayout

    private data class FocusSnapshot(
        val tag: Any?,
        val contentDescription: String?,
        val label: String?,
    )

    private fun focusLabel(view: View): String? = when (view) {
        is TextView -> view.text?.toString()
        is ViewGroup -> descendants(view).filterIsInstance<TextView>()
            .firstOrNull { it.text.isNotEmpty() }?.text?.toString()
        else -> null
    }

    private fun render() = render(appearanceOnly = false)

    private fun render(appearanceOnly: Boolean, preferredFocusTag: Any? = null) {
        enforceInterfaceSize()
        refreshAppearance()
        applyWindowAppearance()
        // A pending assignment belongs to the widgets being replaced, never to another page.
        if (!appearanceOnly) cancelKeyLearning()
        val focusSnapshot = if (appearanceOnly) {
            currentFocus?.let { focused ->
                FocusSnapshot(
                    tag = preferredFocusTag ?: focused.tag,
                    contentDescription = focused.contentDescription?.toString(),
                    label = focusLabel(focused),
                )
            } ?: preferredFocusTag?.let { FocusSnapshot(it, null, null) }
        } else null
        // A restore still waiting for layout keeps its target: the old page was never laid out.
        val sameDestination = renderedPage == page &&
            (page != "settings" || renderedSettingsCategory == settingsCategory)
        val previousScrollY = (pendingScrollY ?: rootScroll?.scrollY)?.takeIf { sameDestination }
        // The rail is one destination even when its selected category changes.
        val keepRailPosition = renderedPage == "settings" && page == "settings"
        val previousRailScrollY = (pendingRailScrollY ?: settingsRailScroll?.scrollY)
            ?.takeIf { keepRailPosition }
        val restoreRailFocus = keepRailPosition &&
            (pendingRailFocus || settingsRailScroll?.hasFocus() == true)
        settingsRailScroll = null
        // The results hang off the old header; the new header reopens them if the search continues.
        settingsSearchPopup?.dismiss()
        settingsSearchPopup = null
        settingsSearchBox = null
        if (page != "settings") clearSettingsSearchState()
        status = null; connectButton = null; disconnectButton = null; lastRunning = null; carButtonCard = null
        reconnectBar = null
        readinessCard = null
        exportButton = null
        bydAdbControls = null
        adbSwitches.clear()
        adbStatus = null
        val compact = isCompactLayout && when (page) {
            "settings" -> !SettingsLayoutPreferences.isActive(this)
            else -> true
        }
        val scroll = ScrollView(this).apply { setBackgroundColor(BG); isFillViewport = true; clipToPadding = false }
        rootScroll = scroll
        val content = column()
        scroll.addView(content)
        val header = if (page == "settings") settingsHeader(compact) else standardHeader(compact)
        val root: View = if (page == "settings" && isExpandedSettingsLayout) {
            content.setPadding(0, 0, 0, dp(32))
            settingsCategoryContent(content)
            expandedSettingsShell(header, scroll)
        } else {
            if (compact) content.setPadding(dp(12), dp(10), dp(12), dp(12))
            else content.setPadding(dp(32), dp(24), dp(32), dp(32))
            content.addView(header)
            content.addView(space(when {
                compact && (page == "settings" || page == "home") -> SETTINGS_BLOCK_GAP_DP
                compact -> 8
                else -> 24
            }))
            if (page == "settings") content.addView(reconnectBar(), LinearLayout.LayoutParams(-1, -2).apply {
                bottomMargin = dp(SETTINGS_BLOCK_GAP_DP)
            })
            when (page) {
                "connection" -> connectionSetup(content)
                "setup" -> setupGuide(content)
                "settings" -> settingsCategoryContent(content)
                "carlife" -> carlife(content)
                "about" -> about(content)
                else -> home(content)
            }
            scroll
        }
        // Keep the background full screen, but all controls inside the camera and
        // visible system/keyboard bounds. Insets are physical pixels, not scaled dp.
        val baseLeft = root.paddingLeft
        val baseTop = root.paddingTop
        val baseRight = root.paddingRight
        val baseBottom = root.paddingBottom
        ViewCompat.setOnApplyWindowInsetsListener(root) { view, insets ->
            val safe = insets.getInsets(
                WindowInsetsCompat.Type.displayCutout() or
                    WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.ime()
            )
            view.setPadding(baseLeft + safe.left, baseTop + safe.top,
                baseRight + safe.right, baseBottom + safe.bottom)
            insets
        }
        // The home's corners hold the screen's own edges: the build bottom-left, a
        // waiting update bottom-right. They sit above the scrolling content, pinned
        // to the physical screen, so they land the same on every display.
        val screen: View = if (page == "home" || page == "carlife") FrameLayout(this).apply {
            addView(root, FrameLayout.LayoutParams(-1, -1))
            val edge = dp(44)
            val lift = dp(26)
            // The build's own version, bottom-left, is the way into About: a driver
            // looking for what changed taps what says which build this is. When a
            // newer release is waiting, the line says so in the warning colour —
            // "有新版本 x.y.z" — and the same tap lands on the same page, where the
            // download lives. availableUpdate is the update check's own verdict,
            // cached and refreshed on open, so the hint is never invented here.
            addView(bottomLeftVersionLabel(), FrameLayout.LayoutParams(-2, -2).apply {
                gravity = Gravity.BOTTOM or Gravity.START
                marginStart = edge
                bottomMargin = lift
            })
            availableUpdate?.let { release ->
                addView(updateCornerChip(release), FrameLayout.LayoutParams(-2, -2).apply {
                    gravity = Gravity.BOTTOM or Gravity.END
                    marginEnd = edge
                    bottomMargin = lift
                })
            }
        } else root
        setContentView(screen)
        // A relayout with the content replaced can show the bars for one frame even
        // though nothing asked for them. Catch it now — before the frame is drawn —
        // and re-hide, so a page change is not a visible push of the page downward.
        val wantedTop = AirPlayPersistence.loadHideTopBar(this) &&
            !(Build.VERSION.SDK_INT >= 24 && isInMultiWindowMode)
        if (wantedTop && fullscreenTopHidden) {
            val (topHidden, _) = systemBarsActuallyHidden()
            if (!topHidden) {
                WindowInsetsControllerCompat(window, window.decorView)
                    .hide(WindowInsetsCompat.Type.statusBars())
            }
        }
        ViewCompat.requestApplyInsets(screen)
        renderedPage = page
        renderedSettingsCategory = settingsCategory.takeIf { page == "settings" }
        refreshStatus()
        focusSnapshot?.let { snapshot ->
            root.doOnLayout {
                descendants(root).firstOrNull { candidate ->
                    candidate.isFocusable && when {
                        snapshot.tag != null -> candidate.tag == snapshot.tag
                        snapshot.contentDescription != null ->
                            candidate.contentDescription?.toString() == snapshot.contentDescription
                        snapshot.label != null -> focusLabel(candidate) == snapshot.label
                        else -> false
                    }
                }?.requestFocus()
            }
        }
        pendingScrollY = previousScrollY
        // A stopped window still dispatches pre-draw but skips layout, so wait for a real layout;
        // the listener stays on this view and goes away with it.
        previousScrollY?.let { y ->
            scroll.doOnLayout {
                if (rootScroll === scroll) {
                    scroll.scrollTo(0, y)
                    pendingScrollY = null
                }
            }
        }
        val rail = settingsRailScroll
        pendingRailScrollY = previousRailScrollY.takeIf { rail != null }
        pendingRailFocus = restoreRailFocus && rail != null
        rail?.doOnLayout {
            if (settingsRailScroll !== rail) return@doOnLayout
            previousRailScrollY?.let { rail.scrollTo(0, it) }
            val destinations = (rail.getChildAt(0) as ViewGroup).getChildAt(0) as ViewGroup
            val selected = (0 until destinations.childCount)
                .map(destinations::getChildAt).firstOrNull { it.isSelected }
            if (selected != null) {
                if (restoreRailFocus) selected.requestFocus()
                selected.requestRectangleOnScreen(android.graphics.Rect(0, 0, selected.width, selected.height), true)
            }
            pendingRailScrollY = null
            pendingRailFocus = false
        }
    }

    /**
     * The home's header, as the design shows it: the brand sits top-left with its glyph,
     * and the right edge carries two ghost icons — the car's own home, then settings —
     * each 34dp with 24dp between them, matching the design's corner icons.
     */
    private fun standardHeader(compact: Boolean): LinearLayout = row().apply {
        gravity = Gravity.CENTER_VERTICAL
        val glyph = dp(if (compact) 44 else 68)
        // Inside the app (connection setup, guide): a back glyph leads the left edge.
        // On the home itself the brand's glyph leads, twice the older corner size.
        if (page != "home" && page != "carlife") {
            addView(headerIcon(R.drawable.ic_dp_back, getString(R.string.back), compact) {
                navigateBack()
            }, LinearLayout.LayoutParams(glyph, glyph))
        } else {
            addView(headerIcon(R.drawable.ic_carplay, getString(R.string.carplay), compact) { },
                LinearLayout.LayoutParams(glyph, glyph))
            // The app's name beside its glyph, so the corner says whose screen this is.
            // The size follows the corner glyph: small enough to sit beside it without
            // competing with the page's own title below.
            addView(label(getString(R.string.app_name), if (compact) 30 else 38, TEXT, true).apply {
                gravity = Gravity.CENTER_VERTICAL
                setPadding(dp(if (compact) 10 else 14), 0, 0, 0)
            }, LinearLayout.LayoutParams(-2, glyph).apply { gravity = Gravity.CENTER_VERTICAL })
        }
        addView(View(this@CarlinkActivity), LinearLayout.LayoutParams(0, 0, 1f))
        // Right edge: one icon, the head unit's home as a house, matching the left glyph.
        // The corner house is a little smaller than the brand glyph, so the brand leads.
        val cornerGlyph = (glyph * 0.8f).roundToInt()
        addView(headerIcon(R.drawable.ic_home_corner, getString(R.string.car_home), compact) {
            startActivity(Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME))
        }, LinearLayout.LayoutParams(cornerGlyph, cornerGlyph))
    }

    /** A corner icon for the home header: a ghost glyph, 34dp, no fill of its own. */
    private fun headerIcon(icon: Int, description: String, compact: Boolean, click: () -> Unit): View =
        ImageButton(this).apply {
            setImageResource(icon)
            contentDescription = description
            // No ripple: an unmasked one spread as a large faint circle over the whole
            // button, which is not what a press here should look like.
            background = null
            scaleType = ImageView.ScaleType.FIT_CENTER
            setPadding(dp(3), dp(3), dp(3), dp(3))
            isClickable = true
            isFocusable = true
            setOnClickListener { click() }
        }

    private fun navigateBack() {
        // Back closes an open search first, like a system search bar.
        if (page == "settings" && settingsSearchQuery.isNotEmpty()) {
            closeSettingsSearch()
            return
        }
        val returnCategory = connectionSettingsReturnCategory
        when {
            page == "about" -> {
                page = "settings"
                settingsCategory = SettingsCategory.OVERVIEW
            }
            page == "setup" && setupStep > SetupGuide.STEP_CAR -> setupStep--
            page == "setup" -> {
                closeSetupGuide()
                return
            }
            page == "connection" && returnCategory != null -> {
                page = "settings"
                settingsCategory = returnCategory
                connectionSettingsReturnCategory = null
            }
            page == "settings" && !isExpandedSettingsLayout && settingsCategory != SettingsCategory.OVERVIEW -> {
                settingsCategory = SettingsCategory.OVERVIEW
            }
            page == "carlife" -> {
                // CarLife 页的返回就是断开：先停掉会话，否则状态还是 CONNECTED，
                // 页面被会话状态拉回连接中，USB 入口再也点不进去。
                CarLifeCenter.disconnect()
                carLifeConnectedOnce = false
                page = "home"
                connectionSettingsReturnCategory = null
            }
            else -> {
                page = "home"
                connectionSettingsReturnCategory = null
            }
        }
        render()
    }

    private fun openConnectionSetupFromSettings() {
        connectionSettingsReturnCategory = settingsCategory
        page = "connection"
        render()
    }

    private fun settingsHeader(compact: Boolean): LinearLayout = row().apply {
        gravity = Gravity.CENTER_VERTICAL
        addView(headerButton(getString(R.string.back), R.drawable.ic_dp_back, compact, ::navigateBack),
            LinearLayout.LayoutParams(-2, if (compact) dp(44) else dp(52)))
        addView(label(getString(R.string.settings), if (compact) 20 else 26, TEXT, true,
            centreGlyphs = true).apply {
            setPadding(dp(12), 0, dp(12), 0)
        }, LinearLayout.LayoutParams(-2, if (compact) dp(44) else dp(52)))
        addView(settingsSearchField(compact), LinearLayout.LayoutParams(0, if (compact) dp(44) else dp(52), 1f).apply {
            marginEnd = dp(if (compact) 8 else 12)
        })
    }


    /** What the link is doing right now; drives which controls the home shows. */
    private fun homeState(): HomeState = when {
        // A stop is in flight: that is the link going away, whatever the link still
        // reports. Judging it as connected left the stop button in place, so pressing
        // it again only queued behind the first stop and looked like nothing happened.
        disconnecting -> HomeState.DISCONNECTING
        CarPlayBackgroundSession.active -> HomeState.CONNECTED
        CarPlayBackgroundSession.hasSession() -> HomeState.CONNECTING
        else -> HomeState.IDLE
    }

    /** True while a disconnect is in flight, so the home does not read it as a connection. */
    @Volatile private var disconnecting = false

    /**
     * The part of the home that follows the link: the status line, its hint, and the
     * controls. The page itself is built once; a transition refills only this box, so the
     * background and the hero stay put instead of the whole screen blinking.
     */
    private var homeStatusBox: LinearLayout? = null
    private var homeStatusBoxState: HomeState? = null
    /** The action row's own box, filled by [buildHomeActions]; it does not move with the status. */
    private var homeActionBox: LinearLayout? = null
    private var homeProgressBar: android.widget.ProgressBar? = null
    private var homeProgressDetail: TextView? = null
    private var homeProgressTicker: Runnable? = null

    // CarLife page fields - follows the same pattern as CarPlay home
    private var carLifeStatusBox: LinearLayout? = null
    private var carLifeActionBox: LinearLayout? = null
    private var carLifeHero: ImageView? = null
    private var carLifeProgressBar: android.widget.ProgressBar? = null
    private var carLifeProgressDetail: TextView? = null

    /**
     * Stops the session. The home shows the link going away rather than coming up: a
     * stop still holds the session for a moment, which otherwise reads as a connection.
     */
    private fun stopSession(after: () -> Unit = {}) {
        phoneAbsentHint = null
        disconnecting = true
        // The driver asked to stop. Say so where the Bluetooth wake-up can see it: the
        // iPhone's link is still up, so its ACL events would otherwise start another
        // connection straight after this one was stopped on purpose.
        getSharedPreferences("diplay_phone_wake", MODE_PRIVATE).edit()
            .putBoolean(keyManualStop, true).apply()
        // Do not re-arm the handover here: a stop is not a new connection, and arming it
        // lets the next tick read the still-active link as a reason to jump back in.
        setProjectionHandled(true)
        // Same reason as a transition: refill the box in place rather than blink the page.
        if (!refreshHomeStatus()) render()
        var settled = false
        val settle = {
            if (!settled) {
                settled = true
                disconnecting = false
                after()
                refreshStatus()
            }
        }
        // End the link itself first, then stop waiting on it at once.
        //
        // The host's own shutdown refuses a second call, and a connection still shaking
        // hands has a controller no stop action knows about. Waiting for either to report
        // back left the handshake running and the home saying "ending" forever, before
        // CarPlay came up as well as after. Closing the link is what ends it; anything
        // the host still has to say afterwards is its own business.
        val ended = CarPlayBackgroundSession.endLink()
        CarPlayBackgroundSession.stop { runOnUiThread(settle) }
        if (ended) {
            runOnUiThread {
                if (!settled) { settle() }
            }
        } else {
            // Nothing was left to close: settle now rather than wait for a reply.
            runOnUiThread(settle)
        }
    }

    private val disconnectTimeoutMillis = 5_000L
    /** Set while a stop the driver asked for has not been answered by a new connection. */
    private val keyManualStop = "manual_stop"
    /** Set when a just-seen release should be fetched without waiting for a tap. */
    private var pendingAutoDownload = false

    /**
     * The bottom-left version line: the installed build's version, or — while a newer
     * release waits — that release's version in the warning colour, so the corner
     * says "there is something newer" without opening a dialog the driver did not ask
     * for. Either way a tap opens About, where the download button already lives.
     */
    private fun bottomLeftVersionLabel(): TextView = label("", 14, MUTED).apply {
        letterSpacing = .1f
        isClickable = true
        isFocusable = true
        contentDescription = getString(R.string.about)
        setOnClickListener { openAboutFromHome() }
        fun paint() {
            val waiting = availableUpdate
            if (waiting != null) {
                text = getString(R.string.home_version_new_available, waiting.tagName.removePrefix("v"))
                setTextColor(WARNING)
                contentDescription = "${getString(R.string.about)}：${getString(R.string.home_version_new_available, waiting.tagName.removePrefix("v"))}"
            } else {
                text = "v${version()}"
                setTextColor(MUTED)
                contentDescription = getString(R.string.about)
            }
        }
        paint()
        // The update check may finish after this view was built; repaint then, so a
        // release seen a moment later is not a corner that still says "up to date".
        // Re-attach alone is not enough: the release can arrive while the view is
        // already on screen, and only a status change carries that.
        val observer: () -> Unit = { runOnUiThread { paint() } }
        net.easyconn.gwmec.update.UpdateAvailability.observeStatus(observer)
        addOnAttachStateChangeListener(object : View.OnAttachStateChangeListener {
            override fun onViewAttachedToWindow(v: View) { paint() }
            override fun onViewDetachedFromWindow(v: View) {
                net.easyconn.gwmec.update.UpdateAvailability.unobserveStatus(observer)
            }
        })
    }

    private fun openAboutFromHome() {
        page = "about"
        render()
    }

    private fun updateCornerChip(release: UpdateRelease): View {
        return row().apply {
            gravity = Gravity.CENTER_VERTICAL
            minimumHeight = dp(48)
            setPadding(dp(8), dp(12), dp(8), dp(12))
            isClickable = true
            isFocusable = true
            contentDescription = getString(R.string.update_available_home)
            addView(ImageView(this@CarlinkActivity).apply {
                setImageResource(R.drawable.ic_update_available)
                val tint = (WARNING and 0x00FFFFFF) or 0xFF000000.toInt()
                setColorFilter(tint)
            }, LinearLayout.LayoutParams(dp(15), dp(15)).apply { marginEnd = dp(8) })
            addView(label(getString(R.string.update_available_home), 15, WARNING).apply {
                // The words are the tap target a screen reader lands on, so they answer too.
                isClickable = true
                isFocusable = true
                setOnClickListener { openAvailableUpdate(release) }
            })
            setOnClickListener { openAvailableUpdate(release) }
        }
    }

    /**
     * Refills the home's status box in place. The page, its background and its hero stay
     * as they are, so a transition is a change of words and controls rather than a blink.
     * Nothing changed and the box is already filled: leave the pixels alone — refilling
     * identical content reads as a blink, and the connect path asks often.
     */

    /**
     * 有线连接入口只在实际插着数据线时出现：充电线不会枚举出 USB 设备，
     * 只有真正的数据连接才会，因此设备列表非空即可视为插着数据线。
     */
    private fun usbDataConnected(): Boolean =
        getSystemService(android.hardware.usb.UsbManager::class.java)?.deviceList?.isNotEmpty() == true

    private val usbStateReceiver = object : android.content.BroadcastReceiver() {
        override fun onReceive(context: Context, intent: android.content.Intent) {
            if (page == "home") refreshHomeStatus()
        }
    }

    /** CarLife 连接页：模式选择、状态与日志都在应用自己的页面系统里。 */
    private fun startCarLife() {
        stopCarLifeDiscovery()
        page = "carlife"
        render()
    }

    /**
     * CarLife 自动连接：主页空闲时监听手机的局域网广播，发现即进入投屏。
     * 仅在主页空闲状态启用，连接建立或离开主页即停，避免与 CarPlay 的连接流互相打扰。
     */
    private var carLifeDiscoveryActive = false

    private fun maybeStartCarLifeDiscovery() {
        if (page != "home" || homeState() != HomeState.IDLE || carLifeDiscoveryActive) return
        carLifeDiscoveryActive = true
        CarLifeDiscovery.start { _ ->
            runOnUiThread {
                carLifeDiscoveryActive = false
                if (homeState() == HomeState.IDLE) startCarLife()
            }
        }
    }

    private fun stopCarLifeDiscovery() {
        if (!carLifeDiscoveryActive) return
        carLifeDiscoveryActive = false
        CarLifeDiscovery.stop()
    }

    private fun refreshHomeStatus(): Boolean {
        val box = homeStatusBox ?: return false
        val state = homeState()
        if (homeStatusBoxState == state && box.childCount > 0) return true
        homeStatusBoxState = state
        status = null
        connectButton = null
        disconnectButton = null
        lastRunning = null
        box.removeAllViews()
        val compact = isCompactLayout
        fun addToStatusBox(view: View, params: LinearLayout.LayoutParams? = null) {
            box.addView(view, params ?: LinearLayout.LayoutParams(-1, -2))
        }
        status = label(getString(R.string.ready_when_you_are), 15, TEXT, true).apply {
            gravity = Gravity.CENTER
            setPadding(0, dp(3), 0, 0)
        }
        addToStatusBox(status!!)
        // The link's progress and its numbers: a bar that says how far along the connection
        // is, and the line under it that says what it is doing and on what. Both are filled
        // by refreshHomeStatus(), so a transition moves the bar and rewrites the line while
        // the rest of the page stays where it is.
        homeProgressBar = android.widget.ProgressBar(
            this, null, android.R.attr.progressBarStyleHorizontal,
        ).apply {
            max = 100
            progress = 0
            isIndeterminate = false
            visibility = View.GONE
        }
        homeProgressDetail = label("", 12, MUTED).apply {
            gravity = Gravity.CENTER
            setPadding(0, dp(5), 0, 0)
            visibility = View.GONE
        }
        fun homeButton(title: String, primary: Boolean, click: () -> Unit) = ghostAction(title, primary) { click() }
        fun homeGhost(title: String, danger: Boolean = false, warn: Boolean = false, click: () -> Unit) =
            ghostAction(title, primary = false, danger = danger, warn = warn) { click() }
        val stackActions = compact && resources.configuration.orientation ==
            android.content.res.Configuration.ORIENTATION_PORTRAIT
        val actions = (if (stackActions) column() else row()).apply {
            gravity = Gravity.CENTER
        }
        fun addAction(view: View, first: Boolean = false) {
            if (!first) actions.addView(ghostDivider(), LinearLayout.LayoutParams(dp(1), dp(18)).apply { gravity = Gravity.CENTER })
            actions.addView(view, LinearLayout.LayoutParams(-2, dp(if (compact) 44 else 52)).apply { gravity = Gravity.CENTER })
        }
        when (state) {
            HomeState.CONNECTING -> {
                status?.text = getString(R.string.connecting_to_your_iphone)
                addToStatusBox(label(getString(R.string.getting_carplay_ready), 11, MUTED).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(3), 0, 0)
                })
                showHomeProgress(
                    phase = getString(R.string.home_progress_connecting),
                    detail = homeConnectionDetail(),
                    indeterminate = true,
                )
                addAction(homeGhost(getString(R.string.retry_carplay_connection)) {
                    disconnectButton?.isEnabled = false
                    stopSession { connect(true) }
                }, first = true)
                addAction(homeGhost(getString(R.string.reset_carplay_wi_fi), warn = true) { openCarWifiSettings() })
                disconnectButton = homeGhost(getString(R.string.stop_connecting), danger = true) {
                    disconnectButton?.isEnabled = false
                    stopSession { refreshStatus() }
                }
                addAction(disconnectButton!!)
                addAction(homeGhost(getString(R.string.settings)) { page = "settings"; render() })
            }
            HomeState.DISCONNECTING -> {
                status?.text = getString(R.string.disconnecting)
                showHomeProgress(
                    phase = getString(R.string.home_progress_disconnecting),
                    detail = homeConnectionDetail(),
                    indeterminate = true,
                )
                addToStatusBox(label(getString(R.string.disconnecting_hint), 11, MUTED).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(3), 0, 0)
                })
            }
            HomeState.CONNECTED -> {
                status?.text = getString(R.string.carplay_connected)
                showHomeProgress(
                    phase = getString(R.string.home_progress_ready),
                    detail = homeConnectionDetail(),
                    indeterminate = false,
                    value = 100,
                )
                connectButton = homeButton(getString(R.string.open_carplay), true) { openProjection() }
                addAction(connectButton!!, first = true)
                addAction(homeGhost(getString(R.string.choose_iphone)) { choosePhone() })
                disconnectButton = homeGhost(getString(R.string.disconnect), danger = true) {
                    disconnectButton?.isEnabled = false
                    stopSession { refreshStatus() }
                }
                addAction(disconnectButton!!)
                addAction(homeGhost(getString(R.string.settings)) { page = "settings"; render() })
            }
            HomeState.IDLE -> {
                hideHomeProgress()
                phoneAbsentHint?.let { hint ->
                    addToStatusBox(label(hint, 14, WARNING).apply {
                        gravity = Gravity.CENTER
                        setPadding(0, dp(4), 0, 0)
                    })
                }
                connectButton = homeButton(getString(R.string.connect_phone), true) {
                    if (CarPlayBackgroundSession.active) openProjection()
                    else connect(true)
                }
                addAction(connectButton!!, first = true)
                if (usbDataConnected()) addAction(homeGhost(getString(R.string.connect_with_usb)) { connect(false) })
                addAction(homeGhost(getString(R.string.carlife_connect)) { startCarLife() })
                if (homeHotspotProblem()) {
                    addAction(homeGhost(getString(R.string.open_car_hotspot_settings), warn = true) { openCarWifiSettings() })
                }
                addAction(homeGhost(getString(R.string.settings)) { page = "settings"; render() })
            }
        }
        // The row the state just built goes into the page's own box for it, whose place
        // was decided when the page was built and does not move with the words above.
        val host = homeActionBox
        if (host != null) {
            host.removeAllViews()
            host.addView(actions, LinearLayout.LayoutParams(-1, -2))
        }
        if (state == HomeState.IDLE) maybeStartCarLifeDiscovery() else stopCarLifeDiscovery()
        return true
    }

    /**
     * The home's progress bar and the line under it.
     *
     * A bar says how far along the link is; the line under it says what it is doing and on
     * what. Both are hidden when the home has nothing to report, so the idle page stays as
     * quiet as it was.
     */
    private fun showHomeProgress(
        phase: String,
        detail: String,
        indeterminate: Boolean,
        value: Int = 0,
    ) {
        val bar = homeProgressBar ?: return
        val detailView = homeProgressDetail ?: return
        if (bar.parent == null) {
            // Placed after the status line, before the actions: the reading order is what
            // is happening, how far along it is, then what to do about it.
            val box = homeStatusBox ?: return
            box.addView(bar, LinearLayout.LayoutParams(dp(200), dp(3)).apply {
                gravity = Gravity.CENTER_HORIZONTAL
                topMargin = dp(11)
            })
            box.addView(detailView, LinearLayout.LayoutParams(-1, -2).apply {
                gravity = Gravity.CENTER_HORIZONTAL
            })
        }
        bar.visibility = View.VISIBLE
        detailView.visibility = if (detail.isEmpty()) View.GONE else View.VISIBLE
        bar.isIndeterminate = indeterminate
        if (!indeterminate) bar.progress = value
        detailView.text = if (phase.isEmpty()) detail else "$phase · $detail"
    }

    private fun hideHomeProgress() {
        homeProgressBar?.visibility = View.GONE
        homeProgressDetail?.visibility = View.GONE
    }

    /**
     * What the home says about the link under the bar: how it is connected, and how long
     * that took. The numbers are only there when they are known.
     */
    private fun homeConnectionDetail(): String {
        val parts = mutableListOf<String>()
        val mode = AirPlayPersistence.loadWirelessHotspotMode(this)
        parts += when (mode) {
            WirelessHotspotMode.WIFI_P2P -> getString(R.string.wifi_direct)
            WirelessHotspotMode.LOCAL_ONLY_HOTSPOT -> getString(R.string.wifi_direct)
            WirelessHotspotMode.EXISTING_WIFI -> getString(R.string.existing_wifi_title)
            WirelessHotspotMode.MANUAL -> getString(R.string.hotspot_name)
        }
        if (CarPlayBackgroundSession.active) {
            val snapshot = CarPlayBackgroundSession.snapshot()
            if (snapshot != null && snapshot.width > 0 && snapshot.height > 0) {
                parts += "${snapshot.width}×${snapshot.height}"
            }
        }
        return parts.joinToString(" · ")
    }

    /** The hotspot warning the idle state shows, kept in one place for both builders. */
    private fun homeHotspotProblem(): Boolean = hotspotStartupResult?.takeIf {
        it != CarHotspotTethering.Result.READY && it != CarHotspotTethering.Result.CANCELLED &&
            CarHotspotSettings.shouldEnable(this, true, AirPlayPersistence.loadWirelessHotspotMode(this)) &&
            net.easyconn.gwmec.network.CarHotspotStatus.isEnabled(this) != true
    } != null || carHotspotOff()

    private fun home(content: LinearLayout) {
        val compact = isCompactLayout
        // The home's controls are ghost labels, not filled buttons: the hero carries the
        // page, and the actions read as text separated by thin dividers, as designed.
        fun homeButton(title: String, primary: Boolean, click: () -> Unit) = ghostAction(title, primary) { click() }
        fun homeGhost(title: String, danger: Boolean = false, warn: Boolean = false, click: () -> Unit) =
            ghostAction(title, primary = false, danger = danger, warn = warn) { click() }
        val body = column().apply { gravity = Gravity.CENTER_HORIZONTAL }

        if (!compact) {
            body.addView(label(getString(R.string.your_phone_your_drive), 12, ACCENT, true).apply {
                gravity = Gravity.CENTER
                letterSpacing = .16f
            })
            body.addView(label(getString(R.string.a_familiar_drive), 34, TEXT, true).apply {
                gravity = Gravity.CENTER
                setPadding(0, dp(10), 0, dp(6))
            })
        }

        // The hero: the head unit and the phone, from one shipped image. It carries the
        // whole story (iPhone projecting to the car display), so the page needs no cards.
        val hero = ImageView(this).apply {
            carLifeHero = this
            setImageResource(R.drawable.hero_carlife)
            contentDescription = getString(R.string.carlife_connect)
            scaleType = ImageView.ScaleType.FIT_CENTER
            adjustViewBounds = true
        }
        val heroHeight = if (compact) dp(120) else dp(200)
        body.addView(hero, LinearLayout.LayoutParams(dp(460), heroHeight).apply {
            gravity = Gravity.CENTER_HORIZONTAL
            bottomMargin = dp(if (compact) 6 else 10)
        })

        // The link's own box: refilled on a transition, the rest of the page untouched.
        //
        // Its height is fixed at what the busiest state needs and its contents are centred
        // inside it, so the words stay in one place: a state that says less leaves the gap
        // above and below rather than pulling the action row up with it.
        val statusBox = column().apply {
            gravity = Gravity.CENTER_VERTICAL
        }
        homeStatusBox = statusBox
        body.addView(statusBox, LinearLayout.LayoutParams(-1, dp(if (compact) 84 else 96)))
        status = label(getString(R.string.ready_when_you_are), 19, TEXT, true).apply {
            gravity = Gravity.CENTER
            setPadding(0, dp(3), 0, 0)
        }
        fun addToStatusBox(view: View, params: LinearLayout.LayoutParams? = null) {
            statusBox.addView(view, params ?: LinearLayout.LayoutParams(-1, -2))
        }
        fun addToBody(view: View, params: LinearLayout.LayoutParams? = null) {
            body.addView(view, params ?: LinearLayout.LayoutParams(-1, -2))
        }
        // The action row's distance from the words above it is fixed, and the words' box
        // is a fixed height, so the row sits at the same height in every state.
        val actionRow = column().apply { gravity = Gravity.CENTER_HORIZONTAL }
        homeActionBox = actionRow
        body.addView(actionRow, LinearLayout.LayoutParams(-1, -2).apply {
            topMargin = dp(if (compact) 16 else 24)
        })

        // The status box is filled by refreshHomeStatus(): one description of what the
        // home shows, used when the page is built and on every transition alike.
        refreshHomeStatus()

        setupError?.let { body.addView(label(it, 16, WARNING).apply { gravity = Gravity.CENTER; setPadding(0, dp(14), 0, 0) }) }

        content.addView(body)
    }

    /**
     * A ghost action for the home row: no fill of its own, just the label, so the hero
     * and the state carry the page. The primary action carries a glow and a hairline
     * underline; destructive and warning actions carry their own colour.
     */
    private fun ghostAction(title: String, primary: Boolean, danger: Boolean = false, warn: Boolean = false, click: () -> Unit): TextView {
        val colour = when {
            danger -> palette.danger
            warn -> WARNING
            primary -> ACCENT
            else -> TEXT
        }
        return TextView(this).apply {
            text = title
            textSize = 19f
            setTextColor(colour)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            gravity = Gravity.CENTER
            setPadding(dp(20), dp(11), dp(20), dp(11))
            isClickable = true
            isFocusable = true
            // The primary action glows: a soft shadow in its own colour.
            if (primary) setShadowLayer(dp(10).toFloat(), 0f, 0f, (ACCENT and 0x00FFFFFF) or 0x50000000)
            // The primary action also carries a hairline underline, brightest at its centre.
            if (primary) {
                val underline = GradientDrawable(
                    GradientDrawable.Orientation.LEFT_RIGHT,
                    intArrayOf(
                        (ACCENT and 0x00FFFFFF) or 0x00000000,
                        ((ACCENT and 0x00FFFFFF) or 0xB3000000.toInt()),
                        (ACCENT and 0x00FFFFFF) or 0x00000000,
                    ),
                ).apply { cornerRadius = dp(1).toFloat() }
                val layered = android.graphics.drawable.LayerDrawable(arrayOf(underline))
                layered.setLayerHeight(0, dp(2))
                layered.setLayerGravity(0, Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL)
                background = layered
            } else {
                // No fill and no ripple: the words are the whole control, and an
                // unmasked ripple drew a large faint circle behind them.
                background = null
            }
            setOnClickListener { click() }
        }
    }

    /** A thin divider between ghost actions, as the design shows between the labels. */
    private fun ghostDivider(): View =
        View(this).apply { layoutParams = LinearLayout.LayoutParams(dp(1), dp(18)).apply { gravity = Gravity.CENTER } }


    // Only the category scrolls, so the rail keeps showing where the driver is.
    private fun expandedSettingsShell(header: View, categoryScroll: ScrollView): LinearLayout = column().apply {
        setBackgroundColor(BG)
        setPadding(dp(32), dp(24), dp(32), 0)
        addView(header)
        addView(space(24))
        addView(reconnectBar(), LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
        val split = row().apply { gravity = Gravity.TOP }
        // The rail scrolls on its own only when the window is too short for every destination.
        split.addView(ScrollView(this@CarlinkActivity).apply {
            addView(column().apply {
                setPadding(0, 0, 0, dp(12))
                addView(settingsRail())
            })
            settingsRailScroll = this
        },
            LinearLayout.LayoutParams(dp(SettingsLayoutPolicy.railWidthDp(resources.configuration.fontScale)), -2))
        split.addView(space(24), LinearLayout.LayoutParams(dp(24), 1))
        split.addView(categoryScroll, LinearLayout.LayoutParams(0, -1, 1f))
        addView(split, LinearLayout.LayoutParams(-1, 0, 1f))
    }

    private fun matchButton(top: Int = 0, height: Int = 68) =
        LinearLayout.LayoutParams(-1, dp(height)).apply { topMargin = dp(top) }

    /** The category rail, in the same plain hand as the settings themselves: no plate. */
    private fun settingsRail(): LinearLayout = column().apply {
        setPadding(dp(12), dp(12), dp(12), dp(12))
        SettingsCategory.entries.forEach { category ->
            addView(settingsRailDestination(category), matchButton(0, 52).apply {
                bottomMargin = if (category == SettingsCategory.entries.last()) 0 else dp(8)
            })
        }
    }

    private fun settingsRailDestination(category: SettingsCategory): View {
        val selected = settingsCategory == category
        val title = settingsCategoryTitle(category)
        return row().apply {
            gravity = Gravity.CENTER_VERTICAL
            isClickable = true
            isFocusable = true
            isSelected = selected
            foreground = focusRing(12)
            contentDescription = getString(R.string.settings_open_category, title)
            // No plate, no border and no ripple: the category is marked by the bar beside
            // it and by its own words taking the accent, the way the home marks what holds
            // the focus. An unmasked ripple spread a large faint circle over the row.
            setPadding(dp(8), 0, dp(12), 0)
            addView(View(this@CarlinkActivity).apply {
                background = GradientDrawable().apply {
                    setColor(if (selected) ACCENT else Color.TRANSPARENT)
                    cornerRadius = dp(2).toFloat()
                }
                importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
            }, LinearLayout.LayoutParams(dp(4), dp(34)).apply { marginEnd = dp(10) })
            addView(ImageView(this@CarlinkActivity).apply {
                setImageResource(settingsCategoryIcon(category))
                imageTintList = ColorStateList.valueOf(if (selected) ACCENT else TEXT)
                importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
            }, LinearLayout.LayoutParams(dp(26), dp(26)).apply { marginEnd = dp(12) })
            val titleView = label(title, 16, if (selected) ACCENT else TEXT, true,
                centreGlyphs = usesChineseGlyphAlignment(resources.configuration.locales[0].language, title))
            // The chosen category glows a little, as the home's primary action does.
            if (selected) titleView.setShadowLayer(dp(8).toFloat(), 0f, 0f,
                (ACCENT and 0x00FFFFFF) or 0x40000000)
            addView(titleView, LinearLayout.LayoutParams(0, -1, 1f))
            setOnClickListener {
                openSettingsCategory(category)
            }
        }
    }

    private fun settingsCategoryIcon(category: SettingsCategory): Int = when (category) {
        SettingsCategory.OVERVIEW -> R.drawable.ic_dp_overview
        SettingsCategory.CONNECTION -> R.drawable.ic_dp_connection
        SettingsCategory.DISPLAY -> R.drawable.ic_dp_display
        SettingsCategory.AUDIO -> R.drawable.ic_dp_audio
        SettingsCategory.NAVIGATION -> R.drawable.ic_dp_navigation
        SettingsCategory.VEHICLE -> R.drawable.ic_dp_car
        SettingsCategory.DIAGNOSTICS -> R.drawable.ic_dp_diagnostics
        SettingsCategory.ADVANCED -> R.drawable.ic_dp_advanced
        SettingsCategory.LANGUAGE -> R.drawable.ic_dp_language
        SettingsCategory.ABOUT -> R.drawable.ic_dp_about
    }

    private fun settingsCategoryTitle(category: SettingsCategory): String = getString(when (category) {
        SettingsCategory.OVERVIEW -> R.string.settings_overview
        SettingsCategory.CONNECTION -> R.string.connection
        SettingsCategory.DISPLAY -> R.string.settings_display
        // The rail says media, not audio: the category holds the sound routing and the
        // screen's video settings together, and "media" names both of them.
        SettingsCategory.AUDIO -> R.string.settings_media
        SettingsCategory.NAVIGATION -> R.string.settings_navigation
        SettingsCategory.VEHICLE -> R.string.settings_vehicle
        SettingsCategory.DIAGNOSTICS -> R.string.diagnostics
        SettingsCategory.ADVANCED -> R.string.settings_advanced
        SettingsCategory.LANGUAGE -> R.string.language_section_title
        SettingsCategory.ABOUT -> R.string.about
    })

    private fun settingsCategoryContent(content: LinearLayout) {
        when (settingsCategory) {
            SettingsCategory.OVERVIEW -> settingsOverview(content)
            SettingsCategory.CONNECTION -> connectionSettings(content)
            SettingsCategory.DISPLAY -> displaySettings(content)
            SettingsCategory.AUDIO -> audioSettings(content)
            SettingsCategory.NAVIGATION -> navigationSettings(content)
            SettingsCategory.VEHICLE -> vehicleSettings(content)
            SettingsCategory.DIAGNOSTICS -> diagnosticsSettings(content)
            SettingsCategory.ADVANCED -> advancedSettings(content)
            SettingsCategory.LANGUAGE -> {
                settingsPageTitle(content, getString(R.string.language_section_title), getString(R.string.settings_language_summary))
                renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.LANGUAGE))
            }
            SettingsCategory.ABOUT -> about(content)
        }
    }

    private fun settingsOverview(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.settings_overview), getString(R.string.settings_overview_subtitle))
        val readiness = card().apply {
            setPadding(dp(20), dp(16), dp(20), dp(16))
        }
        readinessCard = readiness
        renderedReadiness = null
        refreshReadiness()
        content.addView(readiness, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
        content.addView(button(getString(R.string.setup_guide), false) { openSetupGuide(fromSettings = true) },
            LinearLayout.LayoutParams(-1, dp(56)).apply { bottomMargin = dp(6) })
        content.addView(label(getString(R.string.setup_guide_description), 14, MUTED).apply {
            setPadding(0, 0, 0, dp(20))
        })

        val destinations = listOf(
            SettingsCategory.CONNECTION to R.string.settings_connection_summary,
            SettingsCategory.DISPLAY to R.string.settings_display_summary,
            SettingsCategory.AUDIO to R.string.settings_audio_summary,
            SettingsCategory.NAVIGATION to R.string.settings_navigation_summary,
            SettingsCategory.VEHICLE to R.string.settings_vehicle_summary,
            SettingsCategory.LANGUAGE to R.string.settings_language_summary,
            SettingsCategory.ABOUT to R.string.about_diplay,
            SettingsCategory.DIAGNOSTICS to R.string.settings_diagnostics_summary,
            SettingsCategory.ADVANCED to R.string.settings_advanced_subtitle,
        )
        val categoryGap = dp(SETTINGS_BLOCK_GAP_DP)
        val twoColumns = isExpandedSettingsLayout && resources.configuration.let {
            SettingsLayoutPolicy.overviewHasTwoColumns(it.screenWidthDp, it.fontScale)
        }
        if (twoColumns) {
            val columns = row().apply { gravity = Gravity.TOP }
            val setup = column()
            setup.addView(settingsSectionHeading(R.string.settings_your_setup))
            destinations.forEach { item ->
                setup.addView(settingsSummaryCard(item.first, getString(item.second)),
                    LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = categoryGap })
            }
            columns.addView(setup, LinearLayout.LayoutParams(0, -2, 1f))
            columns.addView(space(14), LinearLayout.LayoutParams(dp(14), 1))
            val quick = column()
            quick.addView(settingsSectionHeading(R.string.settings_quick_settings))
            quick.addView(quickSettingsCard())
            columns.addView(quick, LinearLayout.LayoutParams(0, -2, 1f))
            content.addView(columns, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
        } else {
            content.addView(settingsSectionHeading(R.string.settings_your_setup))
            destinations.forEach { item ->
                content.addView(settingsSummaryCard(item.first, getString(item.second)),
                    LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = categoryGap })
            }
            content.addView(settingsSectionHeading(R.string.settings_quick_settings).apply { setPadding(0, dp(10), 0, dp(8)) })
            content.addView(quickSettingsCard(), LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
        }

        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.OVERVIEW))
    }

    private fun currentReadiness() = SettingsReadiness.of(
        setupError = setupError != null,
        active = CarPlayBackgroundSession.active,
        running = CarPlayBackgroundSession.hasSession(),
        wireless = AirPlayPersistence.loadWirelessEnabled(this),
        phoneChosen = CarlinkPreferences.phoneAddress(this) != null,
        hotspotSetupNeeded = AirPlayPersistence.loadWirelessHotspotMode(this) == WirelessHotspotMode.MANUAL &&
            (pendingCarHotspotSetup || carHotspotDetailsMissing() ||
                hotspotError(storedSsid(), storedPassword()) != null),
    )

    private fun refreshReadiness() {
        val card = readinessCard ?: return
        val state = currentReadiness()
        if (state == renderedReadiness) return
        renderedReadiness = state
        card.removeAllViews()
        val title = getString(when (state) {
            SettingsReadiness.SETUP_ERROR, SettingsReadiness.HOTSPOT_SETUP -> R.string.setup_needs_attention
            SettingsReadiness.CONNECTED -> R.string.carplay_connected
            SettingsReadiness.CONNECTING -> R.string.connecting_to_your_iphone
            SettingsReadiness.CHOOSE_IPHONE -> R.string.settings_choose_iphone_title
            SettingsReadiness.READY_WIRELESS, SettingsReadiness.READY_USB -> R.string.ready
        })
        val detail = when (state) {
            SettingsReadiness.SETUP_ERROR -> setupError.orEmpty()
            SettingsReadiness.HOTSPOT_SETUP -> getString(R.string.save_the_name_and_password_from_the_car_s_hotspot_settings)
            SettingsReadiness.CONNECTED -> getString(R.string.settings_ready_connected)
            SettingsReadiness.CONNECTING -> getString(R.string.settings_connecting_description)
            SettingsReadiness.CHOOSE_IPHONE -> getString(R.string.settings_choose_iphone_description)
            SettingsReadiness.READY_WIRELESS -> getString(R.string.settings_ready_wireless, CarlinkPreferences.phoneName(this))
            SettingsReadiness.READY_USB -> getString(R.string.settings_ready_usb)
        }
        val tint = when {
            state.needsAction -> WARNING
            state == SettingsReadiness.CONNECTED -> READY
            else -> TEXT
        }
        card.addView(label(title, 22, tint, true))
        card.addView(label(detail, 15, MUTED).apply { setPadding(0, dp(6), 0, 0) })
        when (state) {
            SettingsReadiness.CHOOSE_IPHONE -> card.addView(button(getString(R.string.settings_choose_iphone_action), true) {
                choosePhone()
            }, matchButton(12, 56))
            SettingsReadiness.SETUP_ERROR, SettingsReadiness.HOTSPOT_SETUP -> card.addView(button(getString(R.string.open_connection_setup), true) {
                openConnectionSetupFromSettings()
            }, matchButton(12, 56))
            else -> Unit
        }
    }

    private fun quickSettingsCard(): LinearLayout = card().also(::buildQuickSettings).also(::normalizeSpacing)

    private fun buildQuickSettings(card: LinearLayout): Unit = card.run {
        toggle(this, getString(R.string.connect_when_diplay_opens),
            getString(R.string.default_connection_description),
            CarlinkPreferences.autoConnect(this@CarlinkActivity)) { enabled ->
                CarlinkPreferences.saveAutoConnect(this@CarlinkActivity, enabled)
                if (!enabled) CarlinkPreferences.saveAutoEnterCarPlay(this@CarlinkActivity, false)
                render()
            }
        // A sub-choice of connecting on open: bring the picture forward once, or stay put.
        if (CarlinkPreferences.autoConnect(this@CarlinkActivity)) {
            toggle(this, getString(R.string.auto_enter_carplay_title),
                getString(R.string.auto_enter_carplay_summary),
                CarlinkPreferences.autoEnterCarPlay(this@CarlinkActivity)) { CarlinkPreferences.saveAutoEnterCarPlay(this@CarlinkActivity, it) }
        }
        appearanceControl(this)
        toggle(this, getString(R.string.full_screen), getString(R.string.settings_full_screen_description),
            AirPlayPersistence.loadHideTopBar(this@CarlinkActivity) && AirPlayPersistence.loadHideBottomBar(this@CarlinkActivity)) { enabled ->
            AirPlayPersistence.saveHideTopBar(this@CarlinkActivity, enabled)
            AirPlayPersistence.saveHideBottomBar(this@CarlinkActivity, enabled)
            applyFullscreenMode()
        }
        toggle(this, getString(R.string.report_location_to_iphone),
            "${getString(R.string.location_reporting_reconnects)} ${getString(R.string.sends_precise_android_location_as_carplay_gps_data_when_th)}",
            AirPlayPersistence.loadLocationReportingEnabled(this@CarlinkActivity), save = ::onLocationReportingChanged)
        Unit
    }

    private fun openSettingsCategory(category: SettingsCategory) {
        if (category == SettingsCategory.ABOUT) page = "about"
        else settingsCategory = category
        render()
    }

    private fun settingsSectionHeading(title: Int) = label(getString(title), 22, TEXT, true).apply {
        setPadding(0, 0, 0, dp(10))
    }

    private fun settingsSummaryCard(category: SettingsCategory, summary: String): LinearLayout = card().apply {
        val warning = category == SettingsCategory.ADVANCED
        setPadding(dp(24), dp(10), dp(24), dp(10))
        isClickable = true
        isFocusable = true
        // The focus ring alone: an unmasked ripple drew a large faint circle over the card.
        foreground = focusRing((layoutCornerRadius() * 1.35f / resources.displayMetrics.density).roundToInt())
        contentDescription = getString(R.string.settings_open_category, settingsCategoryTitle(category))
        addView(row().apply {
            gravity = Gravity.CENTER_VERTICAL
            addView(ImageView(this@CarlinkActivity).apply {
                setImageResource(settingsCategoryIcon(category))
                imageTintList = ColorStateList.valueOf(if (warning) WARNING else ACCENT)
                importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
            }, LinearLayout.LayoutParams(dp(24), dp(24)).apply { marginEnd = dp(20) })
            addView(column().apply {
                addView(label(settingsCategoryTitle(category), 17, if (warning) WARNING else TEXT, true))
                addView(label(summary, 13, MUTED).apply { setPadding(0, dp(3), 0, 0) })
            }, LinearLayout.LayoutParams(0, -2, 1f))
        })
        setOnClickListener { openSettingsCategory(category) }
    }

    private fun settingsPageTitle(content: LinearLayout, title: String, subtitle: String) {
        content.addView(label(title, if (isExpandedSettingsLayout) 34 else 26, TEXT, true))
        content.addView(label(subtitle, 16, MUTED).apply { setPadding(0, dp(6), 0, dp(20)) })
    }

    private fun connectionSettings(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.connection), getString(R.string.settings_connection_summary))
        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.CONNECTION))
    }

    private fun displaySettings(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.settings_display), getString(R.string.settings_display_summary))
        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.DISPLAY))
    }

    private fun nightModeLabels() = CarPlayNightMode.entries.map { mode ->
        getString(when (mode) {
            CarPlayNightMode.SYSTEM -> R.string.carplay_night_system
            CarPlayNightMode.AMBIENT -> R.string.carplay_night_ambient
            CarPlayNightMode.DAY -> R.string.carplay_night_day
            CarPlayNightMode.NIGHT -> R.string.carplay_night_night
            CarPlayNightMode.SCHEDULE -> R.string.carplay_night_schedule
        })
    }

    private fun appearanceControl(parent: LinearLayout) {
        val modes = CarPlayNightMode.entries
        choice(parent, getString(R.string.carplay_night_mode), nightModeLabels(),
            modes.indexOf(AirPlayPersistence.loadCarPlayNightMode(this)), reconnects = false) { index ->
            AirPlayPersistence.saveCarPlayNightMode(this, modes[index])
        }
    }

    private fun audioSettings(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.settings_media), getString(R.string.settings_audio_summary))
        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.AUDIO))
    }

    private fun navigationSettings(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.settings_navigation), getString(R.string.settings_navigation_summary))
        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.NAVIGATION))
        // The BYD card is hidden without its receiver; say so instead of leaving a gap.
        if (!BydOutputSettings.available(this)) {
            content.addView(label(getString(R.string.settings_byd_navigation_unavailable), 15, MUTED).apply {
                setPadding(dp(4), 0, dp(4), dp(SETTINGS_BLOCK_GAP_DP))
            })
        }
    }

    private fun vehicleSettings(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.settings_vehicle), getString(R.string.settings_vehicle_summary))
        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.VEHICLE))
        section(content, getString(R.string.settings_advanced), R.drawable.ic_dp_advanced) { card ->
            card.addView(label(getString(R.string.settings_vehicle_description), 16, MUTED))
            card.addView(button(getString(R.string.settings_open_advanced), false) {
                settingsCategory = SettingsCategory.ADVANCED
                render()
            }, matchButton(14, 56))
        }
    }

    private fun diagnosticsSettings(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.diagnostics), getString(R.string.settings_diagnostics_summary))
        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.DIAGNOSTICS))
    }

    internal data class SettingsSearchResult(val title: String, val category: SettingsCategory)

    // Renders every category into a detached view and records what the builders label.
    // render() afterwards replaces every widget reference those detached builds assigned.
    // ponytail: indexes the default state only; controls behind an expander (vehicle data) are not found.
    private fun buildSettingsSearchIndex(): List<SettingsSearchResult> {
        val selected = settingsCategory
        // Category names first, so a card that only links to a category cannot claim its name.
        val index = SettingsCategory.entries.associateByTo(linkedMapOf(), ::settingsCategoryTitle)
        try {
            for (category in SettingsCategory.entries.filter { it != SettingsCategory.OVERVIEW } + SettingsCategory.OVERVIEW) {
                settingsCategory = category
                val titles = mutableListOf(settingsCategoryTitle(category))
                searchIndexSink = titles
                settingsCategoryContent(column())
                titles.forEach { index.putIfAbsent(it, category) }
            }
        } finally {
            searchIndexSink = null
            settingsCategory = selected
        }
        render()
        return index.map { SettingsSearchResult(it.key, it.value) }
    }

    private fun searchSettings(index: List<SettingsSearchResult>, query: String): List<SettingsSearchResult> {
        val words = query.trim().lowercase(Locale.getDefault()).split(Regex("\\s+")).filter(String::isNotEmpty)
        if (words.isEmpty()) return emptyList()
        return index.filter { result ->
            val haystack = "${result.title} ${settingsCategoryTitle(result.category)}".lowercase(Locale.getDefault())
            words.all(haystack::contains)
        }
    }

    private fun openSearchResult(result: SettingsSearchResult) {
        setSearchKeyboard(settingsSearchBox, false)
        clearSettingsSearchState()
        openSettingsCategory(result.category)
        val scroll = rootScroll ?: return
        val match = descendants(scroll).filterIsInstance<TextView>().firstOrNull {
            it.text.toString() == result.title || it.text.startsWith(result.title + VALUE_SEPARATOR)
        } ?: return
        val target = generateSequence<View>(match) { it.parent as? View }.firstOrNull { it.isClickable } ?: match
        scroll.doOnLayout {
            var top = 0
            var view: View? = target
            while (view != null && view !== scroll) { top += view.top; view = view.parent as? View }
            scroll.smoothScrollTo(0, (top - dp(24)).coerceAtLeast(0))
            target.requestFocus()
            target.isPressed = true
            handler.postDelayed({ target.isPressed = false }, SEARCH_HIGHLIGHT_MILLIS)
        }
    }

    private fun descendants(view: View): Sequence<View> = sequence {
        yield(view)
        if (view is ViewGroup) for (i in 0 until view.childCount) yieldAll(descendants(view.getChildAt(i)))
    }

    /**
     * The settings header search box; matches drop down under it as the driver types.
     * The index is built on the first keystroke. Building re-renders the page, so the
     * replacement box takes over the query, focus and keyboard.
     */
    private fun settingsSearchField(compact: Boolean): EditText = EditText(this).apply {
        settingsSearchBox = this
        setSingleLine()
        hint = getString(R.string.settings_search_hint)
        contentDescription = getString(R.string.settings_search)
        textSize = if (compact) 16f else 18f
        setTextColor(TEXT)
        setHintTextColor(MUTED)
        // No plate, no line: the box is the page itself, and the words are the box.
        background = android.graphics.drawable.ColorDrawable(Color.TRANSPARENT)
        foreground = focusRing()
        setPadding(dp(16), dp(10), dp(16), dp(10))
        compoundDrawablePadding = dp(10)
        setCompoundDrawablesRelativeWithIntrinsicBounds(
            getDrawable(R.drawable.ic_dp_search)?.mutate()?.apply { setTint(MUTED) }, null, null, null)
        inputType = android.text.InputType.TYPE_CLASS_TEXT
        // Landscape head units would otherwise cover the results with a full-screen editor.
        imeOptions = android.view.inputmethod.EditorInfo.IME_FLAG_NO_EXTRACT_UI or
            android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH
        // Touch focus waits for a tap, so opening settings never focuses the box or raises the keyboard.
        isFocusableInTouchMode = settingsSearchRestoreFocus
        setText(settingsSearchQuery)
        setSelection(text.length)
        setOnClickListener {
            if (!isFocusableInTouchMode) {
                isFocusableInTouchMode = true
                requestFocus()
                setSearchKeyboard(this, true)
            }
            showSettingsSearchResults()
        }
        setOnFocusChangeListener { _, focused -> if (focused) showSettingsSearchResults() }
        setOnEditorActionListener { _, actionId, event ->
            val search = actionId == android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH ||
                event?.keyCode == KeyEvent.KEYCODE_ENTER
            if (!search) return@setOnEditorActionListener false
            if (event == null || event.action == KeyEvent.ACTION_DOWN) settingsSearchResults().firstOrNull()?.let(::openSearchResult)
            true
        }
        doAfterTextChanged { onSettingsSearchChanged(this) }
        if (settingsSearchRestoreFocus) {
            settingsSearchRestoreFocus = false
            post {
                if (settingsSearchBox !== this) return@post
                requestFocus()
                setSearchKeyboard(this, true)
                showSettingsSearchResults()
            }
        }
    }

    private fun onSettingsSearchChanged(box: EditText) {
        if (box !== settingsSearchBox) return
        settingsSearchQuery = box.text.toString()
        if (settingsSearchQuery.isEmpty()) {
            // Rebuilt for the next search, so it follows settings that changed meanwhile.
            settingsSearchIndex = null
            settingsSearchPopup?.dismiss()
            return
        }
        if (settingsSearchIndex != null) {
            showSettingsSearchResults()
            return
        }
        if (settingsSearchIndexing) return
        settingsSearchIndexing = true
        // Not from inside the text watcher: indexing replaces this box.
        handler.post {
            settingsSearchIndexing = false
            if (page != "settings" || settingsSearchQuery.isEmpty() || settingsSearchIndex != null) return@post
            settingsSearchRestoreFocus = true
            settingsSearchIndex = buildSettingsSearchIndex()
        }
    }

    private fun settingsSearchResults(): List<SettingsSearchResult> =
        settingsSearchIndex?.let { searchSettings(it, settingsSearchQuery) }.orEmpty()

    private fun showSettingsSearchResults() {
        val box = settingsSearchBox ?: return
        if (settingsSearchIndex == null || settingsSearchQuery.isBlank() || !box.isAttachedToWindow) {
            settingsSearchPopup?.dismiss()
            return
        }
        val results = settingsSearchResults()
        val list = column().apply { setPadding(dp(8), dp(8), dp(8), dp(8)) }
        if (results.isEmpty()) {
            list.addView(label(getString(R.string.settings_search_empty), 15, MUTED).apply {
                setPadding(dp(12), dp(12), dp(12), dp(12))
            })
        }
        results.forEach { list.addView(settingsSearchRow(it)) }
        val width = box.width.coerceAtLeast(dp(320))
        // Short screens keep the results above the keyboard.
        val maxHeight = dp(if (resources.configuration.screenHeightDp < 600) 180 else 360)
        val existing = settingsSearchPopup?.takeIf { it.isShowing }
        val scroll = (existing?.contentView as? ScrollView) ?: ScrollView(this)
        scroll.removeAllViews()
        scroll.addView(list)
        scroll.measure(View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY),
            View.MeasureSpec.makeMeasureSpec(maxHeight, View.MeasureSpec.AT_MOST))
        val height = scroll.measuredHeight.coerceIn(1, maxHeight)
        if (existing != null) {
            existing.update(box, 0, dp(6), width, height)
            return
        }
        settingsSearchPopup = PopupWindow(scroll, width, height, false).apply {
            setBackgroundDrawable(rounded(SURFACE, BORDER))
            elevation = dp(8).toFloat()
            // Tapping elsewhere closes the list and keeps the query; tapping the box reopens it.
            isOutsideTouchable = true
            inputMethodMode = PopupWindow.INPUT_METHOD_NEEDED
            showAsDropDown(box, 0, dp(6), Gravity.END)
        }
    }

    private fun settingsSearchRow(result: SettingsSearchResult): View = column().apply {
        val category = settingsCategoryTitle(result.category)
        isClickable = true
        isFocusable = true
        contentDescription = "${result.title}, $category"
        // The focus ring alone: an unmasked ripple spread a large faint circle over the row.
        foreground = focusRing(12)
        minimumHeight = dp(56)
        gravity = Gravity.CENTER_VERTICAL
        setPadding(dp(12), dp(8), dp(12), dp(8))
        addView(label(result.title, 17, TEXT, true))
        addView(label(category, 13, MUTED))
        setOnClickListener { openSearchResult(result) }
    }

    private fun closeSettingsSearch() {
        val box = settingsSearchBox
        setSearchKeyboard(box, false)
        clearSettingsSearchState()
        box?.setText("")
        box?.clearFocus()
        box?.isFocusableInTouchMode = false
    }

    private fun clearSettingsSearchState() {
        settingsSearchQuery = ""
        settingsSearchIndex = null
        settingsSearchRestoreFocus = false
        settingsSearchPopup?.dismiss()
    }

    private fun setSearchKeyboard(view: View?, show: Boolean) {
        view ?: return
        val keyboard = getSystemService(INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
        if (show) keyboard.showSoftInput(view, android.view.inputmethod.InputMethodManager.SHOW_IMPLICIT)
        else keyboard.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun advancedSettings(content: LinearLayout) {
        settingsPageTitle(content, getString(R.string.settings_advanced), getString(R.string.settings_advanced_subtitle))
        val caution = card().apply {
            addView(label(getString(R.string.settings_advanced_caution_title), 18, WARNING, true))
            addView(label(getString(R.string.settings_advanced_caution_description), 14, MUTED).apply {
                setPadding(0, dp(6), 0, 0)
            })
        }
        content.addView(caution, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
        renderSections(content, SettingsInformationArchitecture.sectionsByCategory.getValue(SettingsCategory.ADVANCED))
        advancedVehicleDataSettings(content)
    }

    private fun advancedVehicleDataSettings(content: LinearLayout) {
        section(content, getString(R.string.settings_vehicle), R.drawable.ic_dp_dashboard) { card ->
            card.addView(button(getString(if (bydVehicleAdvancedExpanded)
                R.string.hide_advanced_vehicle_data else R.string.advanced_vehicle_data), false) {
                bydVehicleAdvancedExpanded = !bydVehicleAdvancedExpanded
                render()
            }, matchButton(0, 56))
            if (bydVehicleAdvancedExpanded) {
                advancedVehicleData(card)
            }
        }
    }

    private fun renderSections(
        content: LinearLayout,
        sections: Set<SettingsSection>,
    ) {
        val previous = settingsSectionFilter
        settingsSectionFilter = sections
        try {
            allSettingsSections(content)
        } finally {
            settingsSectionFilter = previous
        }
    }

    private fun allSettingsSections(content: LinearLayout) {
        filteredSection(content, SettingsSection.CARPLAY_CONTROLS,
            getString(R.string.carplay_controls), R.drawable.ic_dp_controls) { card ->
            val gestureFingers = listOf(0, 2, 3, 4)
            choice(card, getString(R.string.settings_gesture_fingers_label),
                gestureFingers.map { if (it == 0) getString(R.string.settings_gesture_disabled) else getString(R.string.settings_gesture_fingers_option, it) },
                gestureFingers.indexOf(AirPlayPersistence.loadSettingsGestureFingers(this)).coerceAtLeast(0),
                reconnects = false) {
                AirPlayPersistence.saveSettingsGestureFingers(this, gestureFingers[it])
            }
            card.addView(label(getString(R.string.settings_gesture_fingers_hint), 14, MUTED).apply {
                setPadding(0, dp(10), 0, 0)
            })
            toggle(card, getString(R.string.right_hand_drive), getString(R.string.place_carplay_s_controls_closer_to_the_driver), AirPlayPersistence.loadRightHandDrive(this)) { AirPlayPersistence.saveRightHandDrive(this, it); markReconnectNeeded() }
        }
        filteredSection(content, SettingsSection.WHEEL_KEYS,
            getString(R.string.settings_wheel_keys), R.drawable.ic_dp_controls, ::wheelKeysSettings)
        filteredSection(content, SettingsSection.CONNECTION_SETUP,
            getString(R.string.connection_setup), R.drawable.ic_dp_connection) { card ->
            card.addView(label(getString(R.string.choose_how_to_connect_follow_the_setup_steps_and_save_your), 16, MUTED))
            card.addView(button(getString(R.string.open_connection_setup), false, ::openConnectionSetupFromSettings), matchButton(12, 60))
        }
        filteredSection(content, SettingsSection.DIAGNOSTICS,
            getString(R.string.diagnostics), R.drawable.ic_dp_diagnostics) { card ->
            exportButton = button(if (exportInProgress) getString(R.string.saving_report) else getString(R.string.save_diagnostic_report), false) {
                saveReportToDownloads()
            }.apply { isEnabled = !exportInProgress }
            card.addView(exportButton, matchButton(10, 60))
            card.addView(button(getString(R.string.choose_save_location), false) { chooseReportDestination() }, matchButton(10, 60))
            val destination = getString(R.string.reports_save_to_downloads_diplay)
            card.addView(label(destination + getString(R.string.nothing_is_sent_automatically_protocol_payloads_and_creden), 14, MUTED).apply { setPadding(0, dp(12), 0, 0) })
            toggle(card, getString(R.string.settings_fps_counter), getString(R.string.settings_fps_counter_description),
                AirPlayPersistence.loadFpsCounter(this)) { AirPlayPersistence.saveFpsCounter(this, it) }
        }
        filteredSection(content, SettingsSection.AUTOMATIC_CONNECTION,
            getString(R.string.automatic_connection), R.drawable.ic_dp_automation) { card ->
            toggle(card, getString(R.string.connect_when_diplay_opens), getString(R.string.default_connection_description), CarlinkPreferences.autoConnect(this)) { enabled ->
                CarlinkPreferences.saveAutoConnect(this, enabled)
                if (!enabled) CarlinkPreferences.saveAutoEnterCarPlay(this, false)
                render()
            }
            // A sub-choice of connecting on open: bring the picture forward once, or stay put.
            if (CarlinkPreferences.autoConnect(this)) {
                toggle(card, getString(R.string.auto_enter_carplay_title), getString(R.string.auto_enter_carplay_summary), CarlinkPreferences.autoEnterCarPlay(this)) { CarlinkPreferences.saveAutoEnterCarPlay(this, it) }
            }
            toggle(card, getString(R.string.connect_when_iphone_bluetooth_connects),
                getString(R.string.connect_when_iphone_bluetooth_connects_description),
                CarlinkPreferences.connectOnPhoneBluetooth(this)) { enabled ->
                CarlinkPreferences.saveConnectOnPhoneBluetooth(this, enabled)
                if (enabled && Build.VERSION.SDK_INT >= 31 &&
                    checkSelfPermission(Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                    bluetoothAutoConnectPermission.launch(Manifest.permission.BLUETOOTH_CONNECT)
                } else if (enabled && CarlinkPreferences.phoneAddress(this) == null) choosePhone()
            }
            val connectionModes = DefaultConnectionMode.entries
            choice(card, getString(R.string.default_connection_mode), listOf(
                getString(R.string.default_connection_last_used),
                getString(R.string.default_connection_wireless),
                getString(R.string.default_connection_usb)
            ), connectionModes.indexOf(CarlinkPreferences.defaultConnectionMode(this)), reconnects = false) {
                CarlinkPreferences.saveDefaultConnectionMode(this, connectionModes[it])
            }
            adbToggle(card, R.string.open_after_the_car_starts,
                R.string.availability_depends_on_your_head_unit_s_startup_settings,
                read = { AirPlayPersistence.loadAutoStartOnBoot(this) },
                needsAdb = { CarHotspotSettings.enabled(this) &&
                    AirPlayPersistence.loadWirelessHotspotMode(this) == WirelessHotspotMode.MANUAL },
                permissions = { listOf(CarHotspotSetup.Permission.BOOT_LAUNCH) }) {
                AirPlayPersistence.saveAutoStartOnBoot(this, it)
            }
            val autoConfirmActive = UsbPermissionSetup.Permission.ACCESSIBILITY.granted(this)
            toggle(
                card,
                getString(R.string.usb_auto_confirm_title),
                getString(R.string.usb_auto_confirm_subtitle),
                autoConfirmActive,
            ) { enabled ->
                if (enabled) promptEnableUsbAutoConfirm()
                else {
                    if (!UsbAutoConfirmService.openSettings(this)) toast(getString(R.string.wheel_keys_no_settings))
                    render()
                }
            }
            if (!autoConfirmActive) {
                card.addView(
                    button(
                        getString(R.string.btn_auto_apply_permissions),
                        true,
                    ) {
                        autoApplyPermissions()
                    },
                    matchButton(8, 54),
                )
            } else {
                card.addView(label(getString(R.string.usb_auto_confirm_active_hint), 14, READY).apply {
                    setPadding(0, dp(4), 0, dp(8))
                })
            }
            card.addView(button(getString(R.string.boot_start_repair), false) { repairBootStart() }, matchButton(6, 56))
            card.addView(label(getString(R.string.boot_start_repair_desc), 14, MUTED).apply { setPadding(0, dp(8), 0, dp(6)) })
            card.addView(button("${getString(R.string.choose_iphone_prefix)}${CarlinkPreferences.phoneName(this)}", false) { choosePhone() }, matchButton(12, 60))
        }
        filteredSection(content, SettingsSection.USB_CONNECTION,
            getString(R.string.settings_usb_connection), R.drawable.ic_dp_connection) { card ->
            val currents = UsbChargingCurrent.entries
            choice(card, getString(R.string.settings_usb_charging), listOf(
                getString(R.string.settings_usb_charging_normal),
                getString(R.string.settings_usb_charging_reduced),
                getString(R.string.settings_usb_charging_low),
            ), currents.indexOf(AirPlayPersistence.loadUsbChargingCurrent(this)), reconnects = false) {
                AirPlayPersistence.saveUsbChargingCurrent(this, currents[it])
                if (!AirPlayPersistence.loadWirelessEnabled(this)) markReconnectNeeded()
            }
            card.addView(label(getString(R.string.settings_usb_charging_description), 14, MUTED))
        }
        if (settingsSectionFilter?.contains(SettingsSection.BYD_ADB) != false) bydAdbSettings(content)
        filteredSection(content, SettingsSection.DISPLAY_AND_PERFORMANCE,
            getString(R.string.display_and_performance), R.drawable.ic_dp_display) { card ->
            val nightModes = CarPlayNightMode.entries
            val nightMode = AirPlayPersistence.loadCarPlayNightMode(this)
            val ambientControls = column().apply {
                visibility = if (nightMode == CarPlayNightMode.AMBIENT) View.VISIBLE else View.GONE
            }
            val scheduleControls = column().apply {
                visibility = if (nightMode == CarPlayNightMode.SCHEDULE) View.VISIBLE else View.GONE
            }
            choice(
                card,
                getString(R.string.carplay_night_mode),
                nightModeLabels(),
                nightModes.indexOf(nightMode),
                reconnects = false,
            ) { index ->
                AirPlayPersistence.saveCarPlayNightMode(this, nightModes[index])
                ambientControls.visibility = if (nightModes[index] == CarPlayNightMode.AMBIENT) View.VISIBLE else View.GONE
                scheduleControls.visibility = if (nightModes[index] == CarPlayNightMode.SCHEDULE) View.VISIBLE else View.GONE
                handler.post(::checkForAppearanceChange)
            }
            val sentenceSeparator = if (resources.configuration.locales[0].language == "zh") "" else " "
            card.addView(label(getString(R.string.carplay_night_hint) + sentenceSeparator +
                getString(R.string.carplay_night_time_note), 14, MUTED).apply {
                setPadding(0, 0, 0, dp(18))
            })
            ambientControls.addView(label(getString(R.string.carplay_night_ambient_hint), 14, MUTED).apply {
                setPadding(0, 0, 0, dp(18))
            })
            ambientLightThresholdControl(ambientControls)
            nightDelaySettingControl(ambientControls, R.string.ambient_delay_title, R.string.ambient_delay_hint,
                0..60, 2, R.string.ambient_delay_summary, { AirPlayPersistence.loadAmbientDelaySeconds(this) },
                save = { AirPlayPersistence.saveAmbientDelaySeconds(this, it) })
            card.addView(ambientControls)
            scheduleControls.addView(label(getString(R.string.carplay_night_schedule_hint), 14, MUTED).apply {
                setPadding(0, 0, 0, dp(18))
            })
            scheduleTimeControl(scheduleControls, start = true)
            scheduleTimeControl(scheduleControls, start = false)
            card.addView(scheduleControls)
            card.addView(button(getString(R.string.picture_adjustments), false) {
                startActivity(Intent(this, CarPlayHostActivity::class.java)
                    .putExtra("picture_controls", true).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
            }, matchButton(0, 56).apply { bottomMargin = dp(24) })
            carPlaySizeControl(card)
            resolutionSettingControl(
                card, R.string.resolution, R.string.custom_resolution_hint,
                CarPlayDisplayScale.MIN_PERCENT..CarPlayDisplayScale.MAX_PERCENT, 100,
                R.string.custom_resolution_summary,
                { AirPlayPersistence.loadDisplayScalePercent(this) }, reconnects = true,
                save = { AirPlayPersistence.saveDisplayScalePercent(this, it) },
            )
            choice(card, getString(R.string.frame_rate), listOf(getString(R.string.s_30_fps_lighter_load), getString(R.string.s_60_fps_smoother_motion)), if (AirPlayPersistence.loadFps(this) == 60) 1 else 0) { AirPlayPersistence.saveFps(this, if (it == 1) 60 else 30) }
            carPlayDockControl(card)
            addSystemBarControls(
                hideTopBar = AirPlayPersistence.loadHideTopBar(this),
                hideBottomBar = AirPlayPersistence.loadHideBottomBar(this),
                onHideTopBarChanged = { AirPlayPersistence.saveHideTopBar(this, it); applyFullscreenMode() },
                onHideBottomBarChanged = { AirPlayPersistence.saveHideBottomBar(this, it); applyFullscreenMode() },
            ) { label, checked, onChanged ->
                toggle(card, getString(label), getString(R.string.hide_the_car_s_system_bars_while_carplay_is_open), checked, save = onChanged)
            }
            toggle(card, getString(R.string.temporary_system_bars), getString(R.string.temporary_system_bars_description),
                AirPlayPersistence.loadTemporarySystemBars(this)) {
                AirPlayPersistence.saveTemporarySystemBars(this, it)
            }
            val radii = CarPlayBlackCornerOverlay.RADII_DP
            choice(card, getString(R.string.black_corner_overlay),
                radii.map { value ->
                    if (value == CarPlayBlackCornerOverlay.IPHONE_MASK) getString(R.string.iphone_corner_mask_mode)
                    else if (value == 0) getString(R.string.black_corner_overlay_off)
                    else getString(R.string.black_corner_overlay_value, value)
                },
                radii.indexOf(AirPlayPersistence.loadBlackCornerRadiusDp(this)), reconnects = false) {
                AirPlayPersistence.saveBlackCornerRadiusDp(this, radii[it])
            }
            toggle(card, getString(R.string.adapt_pip_resolution), getString(R.string.adapt_pip_resolution_description), AirPlayPersistence.loadAdaptPipResolution(this)) {
                AirPlayPersistence.saveAdaptPipResolution(this, it)
            }
            card.addView(button("${getString(R.string.settings_interface_size)} · ${InterfaceSize.displayName(this, InterfaceSize.preference(this))}", false) {
                InterfaceSize.showPicker(this)
            }, matchButton(12, 60))
            card.addView(label(getString(R.string.settings_interface_size_hint), 14, MUTED))
            if (!isNaturallyExpandedSettingsLayout) toggle(card, getString(R.string.settings_force_full_settings),
                getString(R.string.settings_force_full_settings_hint), SettingsLayoutPreferences.forceFull(this)) {
                SettingsLayoutPreferences.saveForceFull(this, it)
                render()
            }
        }
        filteredSection(content, SettingsSection.LAUNCHER_BUBBLE,
            getString(R.string.settings_launcher_bubble), R.drawable.ic_carplay) { card ->
            toggle(card, getString(R.string.settings_launcher_bubble),
                getString(R.string.settings_launcher_bubble_description),
                AirPlayPersistence.loadLauncherBubble(this)) { enabled ->
                AirPlayPersistence.saveLauncherBubble(this, enabled)
                if (enabled && !LauncherBubble.permitted(this)) openOverlayPermission()
                if (!enabled) LauncherBubble.hide()
            }
            if (AirPlayPersistence.loadLauncherBubble(this)) {
                val sizes = LauncherBubbleLayout.sizePercents
                choice(card, getString(R.string.settings_launcher_bubble_size),
                    sizes.map { "$it %" },
                    sizes.indexOf(AirPlayPersistence.loadLauncherBubbleSize(this)), reconnects = false) {
                    AirPlayPersistence.saveLauncherBubbleSize(this, sizes[it])
                }
                val overlay = LauncherBubble.permitted(this)
                card.addView(label(if (overlay) getString(R.string.center_map_overlay_allowed)
                    else getString(R.string.center_map_overlay_missing, packageName), 14, if (overlay) MUTED else WARNING))
            }
        }
        filteredSection(content, SettingsSection.EXPERIMENTAL_DISPLAY,
            getString(R.string.settings_experimental_display), R.drawable.ic_dp_display) { card ->
            toggle(card, getString(R.string.split_screen_areas), getString(R.string.split_screen_areas_description),
                SplitScreenSettings.enabled(this)) {
                SplitScreenSettings.setEnabled(this, it)
                markReconnectNeeded()
            }
            toggle(card, getString(R.string.carplay_rotation), getString(R.string.carplay_rotation_description),
                CarPlayRotation.enabled(this)) {
                CarPlayRotation.setEnabled(this, it)
                render()
                markReconnectNeeded()
            }
            toggle(card, getString(R.string.side_panel), getString(R.string.side_panel_description), SidePanelSettings.enabled(this)) {
                SidePanelSettings.setEnabled(this, it)
                markReconnectNeeded()
            }
            if (CarPlayRotation.enabled(this)) {
                val pictures = CarPlayRotation.Picture.entries
                choice(card, getString(R.string.carplay_rotation_picture), listOf(
                    getString(R.string.carplay_rotation_smoother),
                    getString(R.string.carplay_rotation_sharper),
                ), pictures.indexOf(CarPlayRotation.picture(this)), reconnects = false) {
                    CarPlayRotation.setPicture(this, pictures[it])
                    markReconnectNeeded()
                }
            }
        }
        // Opt-in controls that can cost sound or video on some head units.
        filteredSection(content, SettingsSection.ADVANCED_MEDIA,
            getString(R.string.settings_advanced_media), R.drawable.ic_dp_advanced) { card ->
            if (Build.VERSION.SDK_INT == 32) {
                toggle(card, getString(R.string.settings_hide_byd_call_popup),
                    getString(R.string.settings_hide_byd_call_popup_description),
                    AirPlayPersistence.loadHideBydCallPopup(this)) {
                    AirPlayPersistence.saveHideBydCallPopup(this, it)
                }
            }
            toggle(card, getString(R.string.efficient_video), getString(R.string.use_hevc_leave_off_for_the_widest_head_unit_compatibility), AirPlayPersistence.loadHevcEnabled(this)) { AirPlayPersistence.saveHevcEnabled(this, it); markReconnectNeeded() }
            toggle(card, getString(R.string.smooth_video), getString(R.string.smooth_video_description),
                AirPlayPersistence.loadSmoothVideo(this)) {
                AirPlayPersistence.saveSmoothVideo(this, it)
                reconnectIfRunning()
            }
            toggle(card, getString(R.string.settings_direct_video_output),
                getString(R.string.settings_direct_video_output_description),
                AirPlayPersistence.loadDirectVideoOutput(this)) {
                AirPlayPersistence.saveDirectVideoOutput(this, it)
                reconnectIfRunning()
            }
            toggle(card, getString(R.string.settings_low_latency_decoder),
                getString(R.string.settings_low_latency_decoder_description),
                AirPlayPersistence.loadLowLatencyDecoder(this)) {
                AirPlayPersistence.saveLowLatencyDecoder(this, it)
                markReconnectNeeded()
            }
            toggle(card, getString(R.string.call_echo_cancellation), getString(R.string.call_echo_cancellation_description),
                AirPlayPersistence.loadCallEchoCancellation(this)) {
                AirPlayPersistence.saveCallEchoCancellation(this, it)
                markReconnectNeeded()
            }
            toggle(card, getString(R.string.call_voice_filter), getString(R.string.call_voice_filter_description),
                AirPlayPersistence.loadCallVoiceFilter(this)) {
                AirPlayPersistence.saveCallVoiceFilter(this, it)
                markReconnectNeeded()
            }
            audioFocusControls(card)
            if (resources.getBoolean(R.bool.config_advanced_audio_channel_mapping)) {
                toggle(card, getString(R.string.advanced_audio_channel_mapping),
                    getString(R.string.use_usage_content_type_routing_instead_of_stream_type),
                    AirPlayPersistence.loadAdvancedAudioChannelMapping(this)) {
                    AirPlayPersistence.saveAdvancedAudioChannelMapping(this, it)
                    markReconnectNeeded()
                }
            }
            toggle(card, getString(R.string.main_buffered_audio), getString(R.string.main_buffered_audio_description),
                AirPlayPersistence.loadMainBufferedAudio(this)) {
                AirPlayPersistence.saveMainBufferedAudio(this, it)
                reconnectIfRunning()
            }
            toggle(card, getString(R.string.settings_car_bluetooth_audio), getString(R.string.settings_car_bluetooth_audio_description),
                AirPlayPersistence.loadCarBluetoothAudio(this)) {
                AirPlayPersistence.saveCarBluetoothAudio(this, it)
                reconnectIfRunning()
            }
        }
        filteredSection(content, SettingsSection.CAR_BUTTON,
            getString(R.string.car_button_in_carplay), R.drawable.ic_dp_car) { card -> carButtonCard = card; carButtonControls(card) }
        filteredSection(content, SettingsSection.AUDIO_ROUTING,
            getString(R.string.audio_routing), R.drawable.ic_dp_audio) { card ->
            mediaChannelControl(card)
            navigationChannelControl(card)
            val bufferPresets = net.easyconn.gwmec.media.MediaAudioBuffer.presets
            choice(card, getString(R.string.music_buffer), listOf(getString(R.string.s_300_ms_default), getString(R.string.s_500_ms), getString(R.string.s_1000_ms_most_stable)),
                bufferPresets.indexOf(AirPlayPersistence.loadMediaBufferMillis(this)).coerceAtLeast(0)) {
                AirPlayPersistence.saveMediaBufferMillis(this, bufferPresets[it])
            }
        }
        filteredSection(content, SettingsSection.NAVIGATION_WHEEL,
            getString(R.string.settings_navigation_wheel_volume), R.drawable.ic_dp_audio) { card ->
            navigationWheelControls(card)
        }
        // Parked video lives with the sound: both answer what the driver sees and hears,
        // and the switch itself is upstream's.
        filteredSection(content, SettingsSection.CARPLAY_VIDEO,
            getString(R.string.video_while_parked), R.drawable.ic_dp_video) { card ->
            toggle(card, getString(R.string.video_while_parked),
                getString(R.string.video_while_parked_description),
                BydOutputSettings.videoWhileParked(this)) {
                BydOutputSettings.setVideoWhileParked(this, it)
                reconnectForVehicleSetting()
            }
        }
        filteredSection(content, SettingsSection.AMBIENT_LIGHTING, getString(R.string.settings_ambient_title)) { card ->
            card.addView(button(ambientConfigurationLabel(AmbientMusicSettings.load(this)), false) {
                showAmbientConfiguration()
            }, matchButton(0, 60))
        }
        filteredSection(content, SettingsSection.LOCATION,
            getString(R.string.location), R.drawable.ic_dp_navigation) { card ->
            toggle(card, getString(R.string.report_location_to_iphone),
                getString(R.string.sends_precise_android_location_as_carplay_gps_data_when_th),
                AirPlayPersistence.loadLocationReportingEnabled(this), save = ::onLocationReportingChanged)
            card.addView(label(getString(R.string.location_reporting_reconnects), 14, MUTED))
        }
        // Cluster video does not require a BYD navigation broadcast receiver.
        filteredSection(content, SettingsSection.PERMISSIONS_AND_HELP,
            getString(R.string.permissions_and_connection_help), R.drawable.ic_dp_permissions) { card ->
            card.addView(label(getString(R.string.nearby_devices_connects_your_iphone_microphone_enables_sir), 16, MUTED))
            card.addView(button(getString(R.string.app_permissions), false) { openSystem(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:$packageName"))) }, matchButton(16, 60))
            card.addView(button(getString(R.string.bluetooth_settings), false) { openSystem(Intent(Settings.ACTION_BLUETOOTH_SETTINGS)) }, matchButton(10, 60))
            card.addView(button(getString(R.string.wireless_connection_help), false) { wirelessHelp() }, matchButton(10, 60))
        }
        languageSettings(content)
    }

    /** CarLife 连接页：信息架构对齐原 APK（状态行/连接方式/滚动日志），视觉沿用本仓库。 */
    private var carLifeConnectedOnce = false
    private var carLifePageListener: net.easyconn.gwmec.carlife.CarLifeSession.Listener? = null

    private fun carlife(content: LinearLayout) {
        val compact = isCompactLayout
        val body = column().apply { gravity = Gravity.CENTER_HORIZONTAL }

        // Same eye-brow + title pair the CarPlay home carries, so both pages put the
        // hero on the same line of the screen: one accent line, one title, no subtitle.
        if (!compact) {
            body.addView(label(getString(R.string.carlife_page_eyebrow), 12, ACCENT, true).apply {
                gravity = Gravity.CENTER
                letterSpacing = .16f
            })
            body.addView(label(getString(R.string.carlife_page_title), 34, TEXT, true).apply {
                gravity = Gravity.CENTER
                setPadding(0, dp(10), 0, dp(6))
            })
        }

        // Hero image - reuse the existing CarLife hero
        val hero = ImageView(this).apply {
            carLifeHero = this
            setImageResource(R.drawable.hero_carlife)
            contentDescription = getString(R.string.carlife_connect)
            scaleType = ImageView.ScaleType.FIT_CENTER
            adjustViewBounds = true
        }
        val heroHeight = if (compact) dp(120) else dp(200)
        body.addView(hero, LinearLayout.LayoutParams(dp(460), heroHeight).apply {
            gravity = Gravity.CENTER_HORIZONTAL
            bottomMargin = dp(if (compact) 6 else 10)
        })

        // Status box - fixed height, filled by refreshCarLifeStatus()
        val statusBox = column().apply { gravity = Gravity.CENTER_VERTICAL }
        carLifeStatusBox = statusBox
        body.addView(statusBox, LinearLayout.LayoutParams(-1, dp(if (compact) 84 else 96)))

        // Action row - filled by refreshCarLifeStatus()
        val actionRow = column().apply { gravity = Gravity.CENTER_HORIZONTAL }
        carLifeActionBox = actionRow
        body.addView(actionRow, LinearLayout.LayoutParams(-1, -2).apply {
            topMargin = dp(if (compact) 16 else 24)
        })

        // Fill the status box and action row
        refreshCarLifeStatus()

        content.addView(body)

        // Session event listener - triggers status refresh instead of full render
        CarLifeCenter.onLogLine = { _ -> runOnUiThread { if (page == "carlife") refreshCarLifeStatus() } }
        carLifePageListener?.let { CarLifeCenter.removeListener(it) }
        val l = object : net.easyconn.gwmec.carlife.CarLifeSession.Listener {
            override fun onState(state: String) {
                runOnUiThread {
                    if (page == "carlife") refreshCarLifeStatus()
                    // 状态刷新
                    if (state.contains("已连接") && !carLifeConnectedOnce) {
                        // 握手成功，保留在连接页等待视频流，也可以手动点“进入投屏”
                    }
                }
            }
            override fun onLog(line: String) {}
            override fun onPhoneInfo(info: String) {}
            override fun onVideoFrame(data: ByteArray, tsMs: Long) {
                runOnUiThread {
                    // 仅当首次连接成功且尚未进入投屏页面时跳转一次，严禁每帧都调用 startActivity 导致系统严重卡死！
                    if (!carLifeConnectedOnce && (CarLifeCenter.connectionState == CarLifeCenter.State.CONNECTED ||
                        CarLifeCenter.session?.running == true)) {
                        carLifeConnectedOnce = true
                        val intent = Intent(this@CarlinkActivity, net.easyconn.gwmec.carlife.CarLifeVideoActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
            override fun onDisconnected() {
                runOnUiThread { carLifeConnectedOnce = false; if (page == "carlife") refreshCarLifeStatus() }
            }
        }
        carLifePageListener = l
        CarLifeCenter.addListener(l)
    }

    private fun refreshCarLifeStatus() {
        val statusBox = carLifeStatusBox ?: return
        val actionBox = carLifeActionBox ?: return
        statusBox.removeAllViews()
        actionBox.removeAllViews()

        val compact = isCompactLayout
        val state = CarLifeCenter.connectionState
        val session = CarLifeCenter.session
        val isConnected = state == CarLifeCenter.State.CONNECTED || (session != null && session.running)

        fun carLifeButton(title: String, primary: Boolean, danger: Boolean = false, warn: Boolean = false, click: () -> Unit) =
            ghostAction(title, primary, danger = danger, warn = warn) { click() }

        val actions = row().apply { gravity = Gravity.CENTER }
        fun addAction(view: View, first: Boolean = false) {
            if (!first) actions.addView(ghostDivider(), LinearLayout.LayoutParams(dp(1), dp(18)).apply { gravity = Gravity.CENTER })
            actions.addView(view, LinearLayout.LayoutParams(-2, dp(if (compact) 44 else 52)).apply { gravity = Gravity.CENTER })
        }

        when {
            // ============ 帧2：已连接 ============
            isConnected -> {
                carLifeHero?.setImageResource(R.drawable.cover_success)
                val statusLabel = label(getString(R.string.carlife_status_connected), 15, TEXT, true).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(3), 0, 0)
                }
                statusBox.addView(statusLabel)

                val subhint = label(getString(R.string.carlife_hint_connected), 13, MUTED).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(5), 0, 0)
                }
                statusBox.addView(subhint)

                addAction(carLifeButton(getString(R.string.carlife_open_projection), primary = true) {
                    startActivity(Intent(this, net.easyconn.gwmec.carlife.CarLifeVideoActivity::class.java))
                }, first = true)
                addAction(carLifeButton(getString(R.string.carlife_disconnect), primary = false, danger = true) {
                    CarLifeCenter.disconnect()
                    refreshCarLifeStatus()
                })
                addAction(carLifeButton(getString(R.string.settings), primary = false) {
                    page = "settings"; render()
                })
            }

            // ============ 帧3：连接中 ============
            state == CarLifeCenter.State.CONNECTING -> {
                carLifeHero?.setImageResource(R.drawable.cover_wait)
                val statusLabel = label(getString(R.string.carlife_status_connecting), 15, TEXT, true).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(3), 0, 0)
                }
                statusBox.addView(statusLabel)

                val progress = android.widget.ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
                    max = 100
                    isIndeterminate = true
                }
                statusBox.addView(progress, LinearLayout.LayoutParams(dp(200), dp(3)).apply {
                    gravity = Gravity.CENTER_HORIZONTAL
                    topMargin = dp(11)
                })

                val subhint = label(getString(R.string.carlife_hint_connecting), 12, MUTED).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(6), 0, 0)
                }
                statusBox.addView(subhint)

                addAction(carLifeButton(getString(R.string.carlife_action_reconnect), primary = false) {
                    CarLifeCenter.disconnect()
                    CarLifeCenter.connect(this, usb = CarLifeCenter.mode != "wifi")
                    refreshCarLifeStatus()
                }, first = true)
                addAction(carLifeButton(getString(R.string.carlife_action_stop_connecting), primary = false, danger = true) {
                    CarLifeCenter.disconnect()
                    refreshCarLifeStatus()
                })
                addAction(carLifeButton(getString(R.string.settings), primary = false) {
                    page = "settings"; render()
                })
            }

            // ============ 帧4：连接遇到问题 / 异常 ============
            state == CarLifeCenter.State.ERROR -> {
                carLifeHero?.setImageResource(R.drawable.cover_fail)
                val statusLabel = label(getString(R.string.carlife_status_error), 15, WARNING, true).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(3), 0, 0)
                }
                statusBox.addView(statusLabel)

                val errText = CarLifeCenter.lastError ?: getString(R.string.carlife_hint_idle)
                val warnLabel = label(errText, 13, WARNING).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(5), 0, 0)
                }
                statusBox.addView(warnLabel)

                addAction(carLifeButton(getString(R.string.carlife_action_reconnect), primary = true) {
                    CarLifeCenter.connect(this, usb = true, canvasWidth = canvasW(), canvasHeight = canvasH())
                    refreshCarLifeStatus()
                }, first = true)
                addAction(carLifeButton(getString(R.string.carlife_connect_wireless), primary = false) {
                    CarLifeCenter.connect(this, usb = false, canvasWidth = canvasW(), canvasHeight = canvasH())
                    refreshCarLifeStatus()
                })
                addAction(carLifeButton(getString(R.string.settings), primary = false) {
                    page = "settings"; render()
                })
            }

            // ============ 帧1：未连接 / 一切就绪 ============
            else -> {
                carLifeHero?.setImageResource(R.drawable.cover_wait)
                val statusLabel = label(getString(R.string.carlife_status_ready), 15, TEXT, true).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(3), 0, 0)
                }
                statusBox.addView(statusLabel)

                val subhint = label(getString(R.string.carlife_hint_idle), 13, MUTED).apply {
                    gravity = Gravity.CENTER
                    setPadding(0, dp(5), 0, 0)
                }
                statusBox.addView(subhint)

                addAction(carLifeButton(getString(R.string.carlife_connect_usb), primary = true) {
                    CarLifeCenter.connect(this, usb = true, canvasWidth = canvasW(), canvasHeight = canvasH())
                    refreshCarLifeStatus()
                }, first = true)
                addAction(carLifeButton(getString(R.string.carlife_connect_wireless), primary = false) {
                    CarLifeCenter.connect(this, usb = false, canvasWidth = canvasW(), canvasHeight = canvasH())
                    refreshCarLifeStatus()
                })
                addAction(carLifeButton(getString(R.string.settings), primary = false) {
                    page = "settings"; render()
                })
            }
        }

        actionBox.addView(actions, LinearLayout.LayoutParams(-1, -2))
    }

    /**
     * 投屏画布尺寸：取屏幕物理像素，对齐原版 mSurfaceView.getWidth()/getHeight()。
     * 连接时就要传给会话，不能等投屏页建好再补——那时握手已经谈完参数了。
     */
    private fun canvasW(): Int = resources.displayMetrics.widthPixels
    private fun canvasH(): Int = resources.displayMetrics.heightPixels

    private fun carLifeModeText(): String = when (CarLifeCenter.mode) {
        "usb" -> getString(R.string.carlife_mode_usb)
        "wifi" -> getString(R.string.carlife_mode_wifi)
        else -> getString(R.string.carlife_mode_none)
    }

    private fun about(content: LinearLayout) {
        content.addView(label(getString(R.string.diplay), 40, TEXT, true))
        content.addView(label(getString(R.string.carplay_at_home_in_your_car), 20, MUTED).apply { setPadding(0, dp(8), 0, dp(24)) })
        section(content, "${buildLineLabel()} · ${version()}") { card ->
            // What the receiver is, in one line - and then what this build changed, which
            // is what a driver opening the page actually came to see.
            card.addView(label(getString(R.string.about_description_short), 17, TEXT))
            changelogView()?.let { card.addView(it) }
            card.addView(updateRow())
            toggle(card, getString(R.string.settings_background_update_checks),
                getString(R.string.settings_background_update_checks_description),
                UpdateAvailability.backgroundChecksEnabled(this)) { enabled ->
                    UpdateAvailability.saveBackgroundChecksEnabled(this, enabled)
                    render()
                }
            // A choice under looking for updates: fetch the new build as soon as it is
            // seen, so installing later is immediate. Only one download is ever kept.
            if (UpdateAvailability.backgroundChecksEnabled(this)) {
                toggle(card, getString(R.string.settings_auto_download_update),
                    getString(R.string.settings_auto_download_update_description),
                    UpdateAvailability.autoDownload(this)) { UpdateAvailability.saveAutoDownload(this, it) }
            }
            toggle(card, getString(R.string.settings_update_mirror),
                getString(R.string.settings_update_mirror_description),
                UpdateMirror.enabled(this)) { UpdateMirror.saveEnabled(this, it) }
        }
        section(content, getString(R.string.made_possible_by_open_source)) { card ->
            card.addView(label(getString(R.string.receiver_based_on_xcertplay_licensed_under_gpl_3_0_diplay), 16, MUTED))
        }
    }

    private enum class UpdateStage { IDLE, CHECKING, AVAILABLE, DOWNLOADING, VERIFYING, READY, FAILED }

    /**
     * What the new release says about itself, shown under the button. Kept short: a
     * changelog that fills the screen pushes the button it belongs to out of reach.
     */
    private fun releaseNotes(release: net.easyconn.gwmec.update.UpdateRelease?): View? {
        val text = release?.notes?.trim().orEmpty()
        if (text.isEmpty()) return null
        val trimmed = if (text.length > 420) text.take(420).trimEnd() + "…" else text
        return label(trimmed, 13, MUTED).apply {
            setPadding(0, dp(10), 0, 0)
            setLineSpacing(dp(3).toFloat(), 1f)
        }
    }

    private fun updateRow(): View {
        val container = column().apply { setPadding(0, dp(12), 0, 0) }
        updateMessage?.let { container.addView(label(it, 14, MUTED)) }
        when (updateStage) {
            UpdateStage.IDLE, UpdateStage.FAILED ->
                container.addView(button(getString(R.string.update_check), false) { checkForUpdates() },
                    matchButton(if (updateMessage == null) 0 else 10, 60))
            UpdateStage.CHECKING -> container.addView(label(getString(R.string.update_checking), 14, MUTED))
            UpdateStage.AVAILABLE -> {
                container.addView(
                    button(getString(R.string.update_download), true) { downloadUpdate() },
                    matchButton(10, 60))
                releaseNotes(updateRelease)?.let { container.addView(it) }
            }
            UpdateStage.DOWNLOADING -> {
                container.addView(label(getString(R.string.update_downloading, updateProgress ?: 0), 14, MUTED))
                // What is coming stays on screen while it arrives: an automatic download
                // goes straight past the "available" step, and the news should not be
                // something the driver only sees once the file is already there.
                releaseNotes(updateRelease)?.let { container.addView(it) }
            }
            UpdateStage.VERIFYING -> {
                container.addView(label(getString(R.string.update_verifying), 14, MUTED))
                releaseNotes(updateRelease)?.let { container.addView(it) }
            }
            UpdateStage.READY -> {
                container.addView(
                    button(getString(R.string.update_install, updateRelease?.tagName.orEmpty()), true) { installUpdate() },
                    matchButton(10, 60))
                releaseNotes(updateRelease)?.let { container.addView(it) }
                updateSavedPath?.let { container.addView(label(getString(R.string.update_saved_to, it), 13, MUTED).apply { setPadding(0, dp(10), 0, 0) }) }
            }
        }
        return container
    }

    private fun checkForUpdates() {
        updateStage = UpdateStage.CHECKING
        updateMessage = null
        val generation = ++updateGeneration
        render()
        Thread({
            val outcome = runCatching { latestRelease() }
            runOnUiThread {
                if (generation != updateGeneration || isFinishing || isDestroyed) return@runOnUiThread
                outcome.fold(
                    { release ->
                        UpdateAvailability.recordAttempt(this, System.currentTimeMillis())
                        availableUpdate = release
                        if (release == null) {
                            UpdateAvailability.clear(this)
                            updateMessage = getString(R.string.update_up_to_date)
                            updateStage = UpdateStage.IDLE
                        } else {
                            UpdateAvailability.save(this, release)
                            updateRelease = release
                            updateStage = UpdateStage.AVAILABLE
                            // Asked to fetch it as soon as it is seen: installing later
                            // is then immediate, and only this download is kept.
                            if (UpdateAvailability.autoDownload(this)) pendingAutoDownload = true
                        }
                        render()
                        if (pendingAutoDownload) {
                            pendingAutoDownload = false
                            downloadUpdate()
                        }
                    },
                    { failure ->
                        Log.w("Carlink-Update", "update check failed", failure)
                        updateMessage = failure.message ?: getString(R.string.update_failed)
                        updateStage = UpdateStage.FAILED
                        render()
                    },
                )
            }
        }, "diplay-update-check").start()
    }


    /**
     * The repository is private, so the feed answers anonymous requests with
     * nothing at all. The value is baked into the assets at build time and
     * kept out of the tree; a build without one simply falls back to
     * anonymous, which is what an upstream build does anyway.
     */
    private fun updateToken(): String? = runCatching {
        assets.open("ota-token.txt").use { it.readBytes() }
            .toString(Charsets.UTF_8).trim().takeIf { it.isNotEmpty() }
    }.getOrNull()

    /**
     * True when this install runs without the system uid — the generic APK
     * on some other device. The update feed follows the install's own line.
     */
    private fun genericBuild(): Boolean = android.os.Process.myUid() != android.os.Process.SYSTEM_UID

    /** The About page names the line this install belongs to. */
    private fun buildLineLabel(): String =
        if (genericBuild()) getString(R.string.about_build_generic)
        else getString(R.string.about_build_custom)

    /**
     * What the version that is installed changed, read from the arrays in changelog.xml.
     *
     * A version with no array of its own - one built before this page existed, or a
     * build with no notes kept - shows nothing rather than a guess, so the page stays
     * honest about what it knows.
     */
    private fun changelogView(): View? {
        val version = version()
        val arrayName = "changelog_" + version.replace('.', '_').replace('-', '_')
        val arrayId = resources.getIdentifier(arrayName, "array", packageName)
        if (arrayId == 0) return null
        val entries = resources.getStringArray(arrayId)
        if (entries.isEmpty()) return null
        val list = column().apply { setPadding(0, 0, 0, dp(4)) }
        entries.forEach { entry ->
            list.addView(label("·  $entry", 15, MUTED).apply {
                setLineSpacing(dp(4).toFloat(), 1f)
                setPadding(0, dp(4), 0, 0)
            })
        }
        return list
    }

    private fun latestRelease(): UpdateRelease? {
        return try {
            val json = UpdateClient.fetchText(
                UpdateClient.RELEASES_URL,
                "application/vnd.github+json",
                userAgent(),
                updateToken(),
            )
            UpdateCatalog.parse(json, genericBuild())
                ?.takeIf { UpdateVersion.isNewer(it.tagName, version()) }
        } catch (io: IOException) {
            // api.github.com 在车机上常不可达：走 releases/latest 重定向兜底（可经镜像）。
            UpdateReleaseLookup.latestViaRedirect(version(), userAgent(), genericBuild())
        }
    }

    private fun openAvailableUpdate(release: UpdateRelease) {
        updateRelease = release
        updateMessage = null
        updateStage = UpdateStage.AVAILABLE
        page = "about"
        render()
    }

    private fun scheduleBackgroundUpdateChecks() {
        runCatching { BackgroundUpdateScheduler.schedule(applicationContext) }
            .onFailure { Log.i("Carlink-Update", "background update scheduling unavailable", it) }
    }

    private fun downloadUpdate() {
        if (updateRelease == null) return
        // A download is already running: show it instead of starting a second one.
        if (updateDownloading) {
            updateStage = UpdateStage.DOWNLOADING
            render()
            return
        }
        updateDownloading = true
        lateinit var release: UpdateRelease
        updateStage = UpdateStage.DOWNLOADING
        updateSavedPath = null
        updateProgress = null
        updateMessage = null
        val generation = ++updateGeneration
        render()
        Thread({
            // Each attempt owns its files, including across activity recreation.
            val tag = updateRelease?.tagName ?: "update"
            val directory = File(cacheDir, "update/${tag.replace(Regex("[^A-Za-z0-9._-]"), "_")}")
            // Only the newest download is worth keeping. An update fetched yesterday and
            // left un-installed is dropped now that a newer one is on its way: waiting
            // for the driver twice only fills the car's storage.
            File(cacheDir, "update").takeIf { it.isDirectory }?.listFiles()
                ?.filter { it.isDirectory && it != directory }
                ?.forEach { stale -> runCatching { stale.deleteRecursively() } }
            val outcome = runCatching {
                // The cached release can be a day old, so download the newest one when
                // the check answers. When the check itself cannot reach GitHub - the
                // usual case on a car network - fall back to the release the driver was
                // actually shown: refusing to download what is on screen would make the
                // hint a dead end.
                release = try {
                    latestRelease() ?: updateRelease ?: throw IOException(getString(R.string.update_up_to_date))
                } catch (io: IOException) {
                    updateRelease ?: throw io
                }
                val checksumsFile = File(directory, UpdateCatalog.CHECKSUMS_FILE)
                UpdateClient.downloadFirstSuccessful(
                    UpdateMirror.routes(applicationContext, release.checksumsUrl),
                    checksumsFile, { _, _ -> }, updateToken(),
                ) { route -> UpdateMirror.rememberWorking(applicationContext, route) }
                val apkFile = File(directory, release.apkName)
                UpdateClient.downloadFirstSuccessful(
                    UpdateMirror.routes(applicationContext, release.apkUrl),
                    apkFile, { written, total ->
                        val percent = total?.takeIf { it > 0 }?.let { (written * 100 / it).toInt() } ?: return@downloadFirstSuccessful
                        if (percent != updateProgress) {
                            updateProgress = percent
                            refreshUpdateUi(generation)
                        }
                    }, updateToken(),
                ) { route -> UpdateMirror.rememberWorking(applicationContext, route) }
                updateStage = UpdateStage.VERIFYING
                refreshUpdateUi(generation)
                val expected = UpdateChecksums.parse(checksumsFile.readText())
                val actual = UpdateChecksums.sha256Hex(apkFile)
                if (!UpdateChecksums.matches(expected, release.apkName, actual)) {
                    throw IOException("Checksum mismatch for ${release.apkName}")
                }
                apkFile
            }.onFailure { directory.deleteRecursively() }
            val saved = outcome.getOrNull()?.let { UpdateApkExport.copy(applicationContext, it) }
            val savedPath = saved?.path
            updateDownloading = false
            runOnUiThread {
                if (generation != updateGeneration || isFinishing || isDestroyed) {
                    return@runOnUiThread
                }
                outcome.fold(
                    { file ->
                        updateRelease = release
                        updateFile = file
                        updateSavedPath = savedPath
                        updateStage = UpdateStage.READY
                        render()
                    },
                    { failure ->
                        Log.w("Carlink-Update", "update download failed", failure)
                        updateMessage = failure.message ?: getString(R.string.update_failed)
                        updateStage = UpdateStage.FAILED
                        render()
                    },
                )
            }
        }, "diplay-update-download").start()
    }

    private fun installUpdate() {
        val file = updateFile ?: return
        // On automotive/system-signed builds, attempt seamless PackageInstaller install
        if (!genericBuild()) {
            runCatching {
                toast(getString(R.string.update_verifying))
                net.easyconn.gwmec.update.UpdateInstaller.install(this, file) { success: Boolean, msg: String ->
                    runOnUiThread {
                        if (!success) {
                            Log.w("Carlink-Update", "silent install failed: $msg, falling back to intent")
                            fallbackInstallApk(file)
                        }
                    }
                }
                return
            }
        }
        fallbackInstallApk(file)
    }

    private fun fallbackInstallApk(file: File) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O || packageManager.canRequestPackageInstalls()) {
            installApk(file)
        } else {
            startActivity(Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES, Uri.parse("package:$packageName")))
        }
    }

    private fun installApk(file: File) {
        val uri = FileProvider.getUriForFile(this, "$packageName.update-apks", file)
        startActivity(
            Intent(Intent.ACTION_VIEW).apply {
                setDataAndType(uri, "application/vnd.android.package-archive")
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_ACTIVITY_NEW_TASK)
            },
        )
    }

    /**
     * Drops update files no install can be reading: they belong to an earlier start, and
     * an install begun then has long finished or been abandoned. Keeps recent ones, so a
     * download the driver has not installed yet survives a restart.
     */
    private fun clearStaleUpdateCache() {
        val root = File(cacheDir, "update").takeIf { it.isDirectory } ?: return
        val cutoff = System.currentTimeMillis() - updateCacheMaxAgeMillis
        root.listFiles()?.filter { it.isDirectory && it.lastModified() < cutoff }
            ?.forEach { stale -> runCatching { stale.deleteRecursively() } }
    }

    private val updateCacheMaxAgeMillis = 7L * 24 * 60 * 60 * 1000


    private fun refreshUpdateUi(generation: Int) {
        runOnUiThread {
            if (generation != updateGeneration || isFinishing || isDestroyed || page != "about") return@runOnUiThread
            render()
        }
    }

    private fun userAgent() = "Carlink/${version()}"

    // An opted-in connection prepares the hotspot in the controller instead of stopping at this reminder.
    /**
     * Whether the car hotspot's name and password have never been saved.
     *
     * Before Connection setup is done there is no hotspot to edit and no name to show, so the
     * sentences that quote it would print an empty pair of quotes.
     */
    private fun carHotspotDetailsMissing(): Boolean =
        storedSsid().isBlank() || storedPassword().isBlank()

    private fun carHotspotOff(): Boolean =
        AirPlayPersistence.loadWirelessHotspotMode(this) == WirelessHotspotMode.MANUAL &&
            CarHotspotSettings.reportedOff(this, net.easyconn.gwmec.network.CarHotspotStatus.isEnabled(this)) &&
            !(CarHotspotSettings.enabled(this) && CarHotspotTethering.permitted(this))

    private fun bydAdbSettings(parent: LinearLayout) {
        if (AirPlayPersistence.loadWirelessHotspotMode(this) != WirelessHotspotMode.MANUAL) return
        if (!CarHotspotSetup.isBydHeadUnit(this)) {
            Log.i("Carlink-Hotspot", "settings hidden: BYD head unit not detected")
            return
        }
        if (searchIndexSink != null) {
            // Index discoverable names without starting the asynchronous permission probe.
            searchIndexSink?.addAll(listOf(
                getString(R.string.byd_adb_features),
                getString(R.string.auto_car_hotspot_title),
                getString(R.string.btn_auto_apply_permissions),
            ))
            return
        }
        val controls = column().apply { visibility = View.GONE }
        bydAdbControls = controls
        parent.addView(controls)
        Thread({
            val access = runCatching { CarHotspotSetup.check(applicationContext) }
                .onFailure { Log.w("Carlink-Hotspot", "settings ADB check failed", it) }
                .getOrDefault(LocalAdb.Access.UNREACHABLE)
            Log.i("Carlink-Hotspot", "settings eligibility: byd=true adb=$access visible=${CarHotspotSettings.visible(true, access)}")
            runOnUiThread {
                if (bydAdbControls !== controls || isFinishing || isDestroyed) return@runOnUiThread
                if (CarHotspotSettings.visible(true, access)) {
                    controls.visibility = View.VISIBLE
                    renderBydAdbControls(controls, access)
                }
            }
        }, "diplay-hotspot-adb-check").start()
    }

    private fun renderBydAdbControls(controls: LinearLayout, access: LocalAdb.Access) {
        controls.removeAllViews()
        adbSwitches.keys.retainAll(setOf(R.string.open_after_the_car_starts))
        adbStatus = null
        controls.visibility = if (CarHotspotSettings.visible(true, access)) View.VISIBLE else View.GONE
        if (controls.visibility == View.GONE) return
        if (AirPlayPersistence.loadWirelessHotspotMode(this) != WirelessHotspotMode.MANUAL) {
            controls.visibility = View.GONE
            return
        }
        section(controls, getString(R.string.byd_adb_features), R.drawable.ic_dp_permissions) { card ->
            if (AirPlayPersistence.loadWirelessHotspotMode(this) == WirelessHotspotMode.MANUAL) {
                adbToggle(card, R.string.auto_car_hotspot_title, R.string.auto_car_hotspot_description,
                    read = { CarHotspotSettings.enabled(this) },
                    permissions = {
                        buildList {
                            add(CarHotspotSetup.Permission.HOTSPOT)
                            if (AirPlayPersistence.loadAutoStartOnBoot(this@CarlinkActivity)) {
                                add(CarHotspotSetup.Permission.BOOT_LAUNCH)
                            }
                        }
                    }) {
                    CarHotspotSettings.setEnabled(this, it)
                    if (!it) startupHotspotCancelled = true
                }
            }
            adbStatus = label(getString(if (access == LocalAdb.Access.READY)
                R.string.adb_access_ready else R.string.adb_not_approved), 14, MUTED).also(card::addView)
            val allReady = UsbPermissionSetup.snapshot(this).values.all { it }
            if (!allReady) {
                card.addView(button(getString(R.string.btn_auto_apply_permissions), false) { autoApplyPermissions() }, matchButton(8, 54))
            } else {
                card.addView(label(getString(R.string.btn_permissions_ready), 14, READY).apply {
                    setPadding(0, dp(6), 0, dp(4))
                })
            }
        }
    }

    private fun adbToggle(parent: LinearLayout, title: Int, description: Int, read: () -> Boolean,
        needsAdb: () -> Boolean = { true },
        permissions: () -> List<CarHotspotSetup.Permission> = { emptyList() }, save: (Boolean) -> Unit) {
        val control = toggle(parent, getString(title), getString(description), read(),
            enabled = !adbSwitchChangePending && !vehicleAdbWorkInProgress()) { enabled ->
            if (updatingAdbSwitches || adbSwitchChangePending) return@toggle
            if (enabled && needsAdb()) requestAdbSwitchChange(permissions()) { save(true) }
            else save(enabled)
        }
        adbSwitches[title] = control to read
    }

    private fun requestAdbSwitchChange(permissions: List<CarHotspotSetup.Permission>, save: () -> Unit) {
        if (adbSwitchChangePending || vehicleAdbWorkInProgress()) {
            updateAdbSwitches()
            return
        }
        cancelAutomaticVehicleValidationForUserOperation(
            resumeAfter = automaticVehicleValidationInProgress || automaticVehicleValidationPending,
        )
        val app = applicationContext
        adbSwitchChangePending = true
        updateAdbSwitches()
        adbStatus?.setText(R.string.adb_checking_may_ask)
        if (page == "settings" && bydVehicleAdvancedExpanded) render()
        Thread({
            var access = LocalAdb.Access.UNREACHABLE
            val ready = runCatching {
                access = CarHotspotSetup.grant(app, permissions)
                access == LocalAdb.Access.READY && permissions.all { it.granted(app) }
            }.getOrDefault(false)
            runOnUiThread {
                adbSwitchChangePending = false
                if (isFinishing || isDestroyed) return@runOnUiThread
                val message = if (ready) {
                    if (permissions.isEmpty()) R.string.adb_access_ready else R.string.hotspot_permission_granted
                } else when (access) {
                    LocalAdb.Access.NOT_APPROVED -> R.string.adb_not_approved
                    LocalAdb.Access.UNREACHABLE -> R.string.adb_off
                    LocalAdb.Access.UNSUPPORTED -> R.string.adb_pairing_only
                    else -> R.string.hotspot_permission_failed
                }
                adbStatus?.setText(if (ready) R.string.adb_access_ready else message)
                if (ready) save()
                updateAdbSwitches()
                toast(getString(message))
                runPendingAutomaticVehicleValidation()
                // Re-enable the vehicle controls disabled while this authorization was outstanding.
                if (page == "settings" && bydVehicleAdvancedExpanded) render()
            }
        }, "diplay-adb-switch").start()
    }

    private fun updateAdbSwitches() {
        updatingAdbSwitches = true
        for ((control, read) in adbSwitches.values) {
            control.isChecked = read()
            control.isEnabled = !adbSwitchChangePending && !vehicleAdbWorkInProgress()
        }
        updatingAdbSwitches = false
    }

    private fun vehicleAdbWorkInProgress(): Boolean =
        adbCheckInProgress || vehicleProbeAuthorizationInProgress || vehicleProbeInProgress

    private fun startCarHotspotOnLaunch() {
        if (!startupHotspotEligible()) return
        val app = applicationContext
        Thread({
            val result = CarHotspotTethering.enable(app,
                isCancelled = { startupHotspotCancelled || !startupHotspotEligible() },
                log = { Log.i("Carlink-Hotspot", it) },
            )
            runOnUiThread {
                if (isFinishing || isDestroyed || result == CarHotspotTethering.Result.CANCELLED) return@runOnUiThread
                hotspotStartupResult = result
                if (page == "home") render()
            }
        }, "diplay-hotspot-startup").start()
    }

    private fun startupHotspotEligible(): Boolean =
        CarHotspotSetup.shouldStartOnLaunch(applicationContext, CarPlayBackgroundSession.hasSession())


    private fun carHotspotOffDialog() {
        appDialogBuilder().setTitle(getString(R.string.car_hotspot_is_off))
            .setMessage(getString(R.string.msg_car_hotspot_connect, AirPlayPersistence.loadManualHotspotSsid(this)))
            .setPositiveButton(getString(R.string.open_car_settings)) { _, _ -> openCarWifiSettings() }
            .setNeutralButton(getString(R.string.connect)) { _, _ ->
                // The driver sees the hotspot on: trust that over Android's report, or this
                // dialog would come back on every tap.
                CarHotspotSettings.setOffReportIgnored(this, true)
                connect(true)
            }
            .setNegativeButton(getString(R.string.cancel), null).show()
    }

    // BYD maps the AOSP tether action to its own hotspot screen; other firmware falls back to Wi-Fi settings.
    // BYD shows that screen as a dialog and closes it unless its own settings or the car home screen is on top,
    // so the home screen goes first.
    private fun repairBootStart() {
        val dialog = appDialogBuilder()
            .setTitle(getString(R.string.boot_start_repair))
            .setMessage(getString(R.string.boot_start_repair_running))
            .setNegativeButton(getString(R.string.common_cancel), null)
            .show()
        Thread({
            val result = runCatching {
                net.easyconn.gwmec.hud.BydBootStartRepair.apply(applicationContext, packageName)
            }.getOrNull()
            runOnUiThread {
                if (isFinishing || isDestroyed) return@runOnUiThread
                dialog.dismiss()
                val text = result?.lines?.joinToString("\n")?.let { getString(R.string.boot_start_repair_result, it) }
                    ?: getString(R.string.adb_check_failed)
                appDialogBuilder()
                    .setTitle(getString(R.string.boot_start_repair))
                    .setMessage(text)
                    .setPositiveButton(android.R.string.ok, null)
                    .show()
            }
        }, "diplay-boot-repair").start()
    }

    private fun openCarWifiSettings() {
        val hotspot = Intent("com.android.settings.WIFI_TETHER_SETTINGS")
        val target = packageManager.resolveActivity(hotspot, 0)?.activityInfo?.packageName
        if (target == null) {
            openSystem(Intent(Settings.ACTION_WIRELESS_SETTINGS))
            return
        }
        if (target == "com.byd.carsettings") {
            runCatching { startActivity(Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME)) }
        }
        if (runCatching { startActivity(hotspot) }.isSuccess) return
        openSystem(Intent(Settings.ACTION_WIRELESS_SETTINGS))
    }

    private fun openCarClientWifiSettings() {
        val wifi = Intent(Settings.ACTION_WIFI_SETTINGS)
        if (packageManager.resolveActivity(wifi, 0)?.activityInfo?.packageName == "com.byd.carsettings") {
            runCatching { startActivity(Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME)) }
        }
        openSystem(wifi)
    }

    private fun openSetupGuide(fromSettings: Boolean) {
        setupFromSettings = fromSettings
        setupStep = SetupGuide.STEP_CAR
        page = "setup"
        render()
    }

    private fun closeSetupGuide(connectNow: Boolean = false) {
        SetupGuide.markSeen(this)
        page = if (setupFromSettings) "settings" else "home"
        setupFromSettings = false
        setupStep = SetupGuide.STEP_CAR
        render()
        if (connectNow) connect(AirPlayPersistence.loadWirelessEnabled(this))
    }

    private fun dilinkLabel(generation: DiLinkGeneration) = getString(when (generation) {
        DiLinkGeneration.DILINK_3 -> R.string.dilink_3
        DiLinkGeneration.DILINK_4 -> R.string.dilink_4
        DiLinkGeneration.DILINK_5 -> R.string.dilink_5
        DiLinkGeneration.GENERIC -> R.string.dilink_generic
        DiLinkGeneration.UNKNOWN -> R.string.dilink_not_sure
    })

    private fun setupGuide(content: LinearLayout) {
        val step = setupStep.coerceIn(SetupGuide.STEP_CAR, SetupGuide.STEP_DONE)
        content.addView(label(getString(R.string.setup_step_of, step + 1, SetupGuide.STEP_COUNT), 13, ACCENT, true)
            .apply { letterSpacing = .12f })
        val progress = row().apply { setPadding(0, dp(10), 0, dp(20)) }
        repeat(SetupGuide.STEP_COUNT) { index ->
            progress.addView(View(this).apply {
                background = GradientDrawable().apply {
                    setColor(if (index <= step) ACCENT else BUTTON); cornerRadius = dp(3).toFloat()
                }
            }, LinearLayout.LayoutParams(0, dp(6), 1f).apply { if (index > 0) marginStart = dp(8) })
        }
        content.addView(progress)
        when (step) {
            SetupGuide.STEP_CAR -> setupCarStep(content)
            SetupGuide.STEP_CONNECTION -> setupConnectionStep(content)
            SetupGuide.STEP_IPHONE -> setupIphoneStep(content)
            SetupGuide.STEP_FEATURES -> setupFeaturesStep(content)
            else -> setupDoneStep(content)
        }
        if (step == SetupGuide.STEP_DONE) return
        val footer = row().apply { gravity = Gravity.CENTER_VERTICAL; setPadding(0, dp(6), 0, 0) }
        footer.addView(button(getString(R.string.setup_skip), false) { closeSetupGuide() },
            LinearLayout.LayoutParams(0, dp(60), 1f))
        footer.addView(space(16), LinearLayout.LayoutParams(dp(16), 1))
        footer.addView(button(getString(R.string.setup_next), true) { setupStep = step + 1; render() },
            LinearLayout.LayoutParams(0, dp(60), 1f))
        content.addView(footer)
    }

    private fun setupTitle(content: LinearLayout, title: Int, description: String) {
        content.addView(label(getString(title), 34, TEXT, true))
        content.addView(label(description, 17, MUTED).apply { setPadding(0, dp(8), 0, dp(24)) })
    }

    private fun setupCarStep(content: LinearLayout) {
        val detection = DiLinkGeneration.detect()
        val selected = DiLinkGeneration.confirmed(this) ?: detection.generation
        setupTitle(content, R.string.setup_car_title, when (detection.source) {
            DiLinkGeneration.Source.SYSTEM_VERSION -> getString(R.string.setup_car_detected, dilinkLabel(detection.generation))
            DiLinkGeneration.Source.LIKELY -> getString(R.string.setup_car_likely, dilinkLabel(detection.generation))
            DiLinkGeneration.Source.NONE -> getString(R.string.setup_car_unknown)
        })
        val card = card()
        card.addView(label(getString(R.string.setup_car_choose), 22, TEXT, true))
        val wide = resources.configuration.screenWidthDp >= 850
        val choices = if (wide) row() else column()
        DiLinkGeneration.entries.forEachIndexed { index, generation ->
            val chosen = generation == selected
            choices.addView(button("${if (chosen) "✓  " else ""}${dilinkLabel(generation)}", chosen) {
                DiLinkGeneration.save(this, generation)
                render()
            }, if (wide) LinearLayout.LayoutParams(0, dp(60), 1f).apply {
                topMargin = dp(12); if (index > 0) marginStart = dp(12)
            } else matchButton(12, 60))
        }
        card.addView(choices)
        detection.evidence?.let {
            card.addView(label(getString(R.string.setup_car_evidence, it), 13, MUTED).apply { setPadding(0, dp(16), 0, 0) })
        }
        content.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
    }

    private fun setupConnectionStep(content: LinearLayout) {
        setupTitle(content, R.string.setup_connection_title, getString(R.string.setup_connection_description))
        val card = card()
        wirelessLinkControls(card)
        content.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
    }

    private fun setupIphoneStep(content: LinearLayout) {
        setupTitle(content, R.string.setup_iphone_title, getString(R.string.keep_bluetooth_and_wi_fi_on_your_iphone_pair_with_the_car))
        val card = card()
        val chosen = CarlinkPreferences.phoneAddress(this) != null
        card.addView(label(if (chosen) CarlinkPreferences.phoneName(this) else getString(R.string.setup_iphone_none), 22,
            if (chosen) READY else TEXT, true))
        card.addView(button("${getString(R.string.choose_iphone_prefix)}${CarlinkPreferences.phoneName(this)}", !chosen) {
            choosePhone()
        }, matchButton(16, 60))
        card.addView(button(getString(R.string.review_app_permissions), false) {
            openSystem(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:$packageName")))
        }, matchButton(12, 60))
        content.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
    }

    private fun setupFeaturesStep(content: LinearLayout) {
        val generation = DiLinkGeneration.current(this)
        setupTitle(content, R.string.setup_features_title, getString(R.string.setup_features_description,
            dilinkLabel(generation)))
        val card = card()
        SetupGuide.features(generation).forEach { entry ->
            val before = card.childCount
            when (entry.feature) {
                SetupGuide.Feature.AUTO_CONNECT -> toggle(card, getString(R.string.connect_when_diplay_opens),
                    getString(R.string.default_connection_description), CarlinkPreferences.autoConnect(this)) {
                    CarlinkPreferences.saveAutoConnect(this, it)
                }
                SetupGuide.Feature.LOCATION -> toggle(card, getString(R.string.report_location_to_iphone),
                    getString(R.string.sends_precise_android_location_as_carplay_gps_data_when_th),
                    AirPlayPersistence.loadLocationReportingEnabled(this), save = ::onLocationReportingChanged)
                SetupGuide.Feature.CALLS_ON_DASHBOARD -> toggle(card, getString(R.string.carplay_calls_on_dashboard),
                    getString(R.string.carplay_calls_on_dashboard_description),
                    BydOutputSettings.carPlayCalls(this), enabled = !adbSwitchChangePending) { applyCarPlayCalls(it) }
                SetupGuide.Feature.CALL_KEYS -> toggle(card, getString(R.string.carplay_call_controls_experimental),
                    getString(R.string.carplay_call_controls_experimental_description),
                    BydOutputSettings.carPlayCallControls(this)) { applyCallKeys(it) }
                // HUD 不是 BYD 专属：主开关对任何车机开放，BYD 通道由运行时探测决定。
                SetupGuide.Feature.HUD_OUTPUT -> toggle(card, getString(R.string.setup_feature_hud),
                    getString(R.string.setup_feature_hud_description),
                    BydOutputSettings.enabled(this)) { BydOutputSettings.setEnabled(this, it) }
            }
            if (card.childCount > before) card.addView(setupBadges(entry))
        }
        content.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
    }

    private fun setupBadges(entry: SetupGuide.Entry): LinearLayout = row().apply {
        setPadding(0, dp(2), 0, dp(14))
        fun badge(text: String, color: Int) = label(text, 12, color, true).apply {
            background = GradientDrawable().apply {
                setColor(Color.TRANSPARENT); cornerRadius = dp(10).toFloat(); setStroke(dp(1), color)
            }
            setPadding(dp(10), dp(3), dp(10), dp(3))
        }
        val tested = entry.status == SetupGuide.Status.TESTED
        addView(badge(getString(if (tested) R.string.setup_badge_tested else R.string.setup_badge_experimental),
            if (tested) READY else WARNING), LinearLayout.LayoutParams(-2, -2))
        if (entry.needsAdb) addView(badge(getString(R.string.setup_badge_adb), ACCENT),
            LinearLayout.LayoutParams(-2, -2).apply { marginStart = dp(8) })
    }

    private fun setupDoneStep(content: LinearLayout) {
        setupTitle(content, R.string.setup_done_title, getString(R.string.setup_done_description))
        val card = card()
        card.addView(button(getString(R.string.connect_phone), true) { closeSetupGuide(connectNow = true) }, matchButton(0, 60))
        card.addView(button(getString(R.string.settings), false) {
            SetupGuide.markSeen(this)
            setupFromSettings = false
            setupStep = SetupGuide.STEP_CAR
            page = "settings"
            render()
        }, matchButton(12, 60))
        card.addView(button(getString(R.string.done), false) { closeSetupGuide() }, matchButton(12, 60))
        content.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
    }

    private fun connectionSetup(content: LinearLayout) {
        content.addView(label(getString(R.string.connection_setup), 34, TEXT, true))
        content.addView(label(getString(R.string.set_up_once_your_details_stay_saved_for_the_next_drive_cha), 17, MUTED).apply { setPadding(0, dp(8), 0, dp(24)) })
        section(content, getString(R.string.s_1_choose_your_connection)) { card -> wirelessLinkControls(card) }
        section(content, getString(R.string.s_2_pair_your_iphone)) { card ->
            card.addView(label(getString(R.string.keep_bluetooth_and_wi_fi_on_your_iphone_pair_with_the_car), 16, MUTED))
            card.addView(button("${getString(R.string.choose_iphone_prefix)}${CarlinkPreferences.phoneName(this)}", false) { choosePhone() }, matchButton(12, 60))
            card.addView(button(getString(R.string.review_app_permissions), false) {
                openSystem(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:$packageName")))
            }, matchButton(12, 60))
        }
        section(content, getString(R.string.s_3_connect)) { card ->
            card.addView(label(getString(R.string.return_from_car_settings_to_diplay_then_connect_accept_the), 16, MUTED))
            card.addView(button(getString(R.string.connect_phone), true) { connect(true) }, matchButton(12, 60))
        }
        section(content, getString(R.string.prefer_a_cable)) { card ->
            card.addView(label(getString(R.string.use_a_usb_data_cable_and_the_car_s_usb_data_port_unlock_yo), 16, MUTED))
            card.addView(button(getString(R.string.connect_with_usb), false) { connect(false) }, matchButton(12, 60))
        }
    }

    private fun wirelessLinkControls(parent: LinearLayout) {
        val mode = if (pendingCarHotspotSetup) WirelessHotspotMode.MANUAL else AirPlayPersistence.loadWirelessHotspotMode(this)
        val modes = listOf(WirelessHotspotMode.MANUAL, WirelessHotspotMode.WIFI_P2P, WirelessHotspotMode.EXISTING_WIFI)
        val titles = listOf(getString(R.string.settings_built_in_car_hotspot_recommended), getString(R.string.wifi_direct), getString(R.string.existing_wifi_title))
        val descriptions = listOf(
            getString(R.string.hotspot_mode_manual_desc),
            getString(R.string.hotspot_mode_p2p_desc),
            getString(R.string.existing_wifi_description)
        )
        val wide = resources.configuration.screenWidthDp >= 850
        val choices = if (wide) row().apply { gravity = Gravity.TOP } else column()
        parent.addView(choices)
        modes.forEachIndexed { index, candidate ->
            val option = column()
            choices.addView(option, if (wide) LinearLayout.LayoutParams(0, -2, 1f).apply {
                if (index > 0) marginStart = dp(16)
            } else LinearLayout.LayoutParams(-1, -2))
            option.addView(button("${if (mode == candidate) "✓  " else ""}${titles[index]}", mode == candidate) {
                if (candidate == WirelessHotspotMode.MANUAL) {
                    pendingCarHotspotSetup = true
                    render()
                } else if (candidate == WirelessHotspotMode.EXISTING_WIFI) {
                    // Nothing saved means nothing to choose from, so the name and password
                    // have to be asked for once. With a network already remembered the mode
                    // is simply selected: what to do with it - keep it, change it, open the
                    // car own Wi-Fi settings - is the driver to choose from what the page
                    // now shows, not a question to be pushed at them first.
                    pendingCarHotspotSetup = false
                    if (AirPlayPersistence.loadExistingWifiSsid(this).isBlank()) {
                        askHotspotCredentials(existingWifi = true) { ssid, password, _, _ ->
                            AirPlayPersistence.saveExistingWifiCredentials(this, ssid, password)
                            applyWirelessLink(candidate)
                        }
                    } else {
                        selectWirelessLink(candidate)
                    }
                } else {
                    pendingCarHotspotSetup = false
                    applyWirelessLink(candidate)
                }
            }, matchButton(12, 60))
            option.addView(label(descriptions[index], 15, MUTED).apply { setPadding(0, dp(6), 0, dp(12)) })
        }
        if (mode == WirelessHotspotMode.MANUAL) {
            parent.addView(label(getString(R.string.hotspot_setup), 22, TEXT, true))
            parent.addView(label(getString(R.string.s_1_open_car_hotspot_settings_turn_the_hotspot_on_and_sele), 16, MUTED).apply { setPadding(0, dp(8), 0, dp(12)) })
            parent.addView(button(getString(R.string.open_car_hotspot_settings), false) { openCarWifiSettings() }, matchButton(0, 60))
            val detailsMissing = carHotspotDetailsMissing()
            parent.addView(button(if (detailsMissing) getString(R.string.save_hotspot_details_and_use_this_mode) else "${getString(R.string.edit_saved_hotspot_prefix)}${storedSsid()}", false) {
                askHotspotCredentials { ssid, password, security, interfaceName ->
                    saveHotspotCredentials(ssid, password, security, interfaceName)
                    pendingCarHotspotSetup = false
                    applyWirelessLink(WirelessHotspotMode.MANUAL)
                }
            }, matchButton(12, 60))
            parent.addView(label(if (detailsMissing) getString(R.string.finish_setup_save_your_hotspot_details_to_use_this_mode) else if (carHotspotOff()) getString(R.string.hotspot_details_off) else getString(R.string.hotspot_details_saved), 15, if (carHotspotOff()) WARNING else MUTED).apply { setPadding(0, dp(12), 0, 0) })
            val join = hotspotJoinControls ?: HotspotJoinControls(this,
                { CarPlayBackgroundSession.hasSession() }, beforeAction = { startupHotspotCancelled = true },
                labelFactory = { label(it, 15, MUTED) }, buttonFactory = { title, click -> button(title, false, click) })
                .also { hotspotJoinControls = it }
            parent.addView(join.build())
        } else if (mode == WirelessHotspotMode.EXISTING_WIFI) {
            parent.addView(label(getString(R.string.existing_wifi_instructions), 16, MUTED))
            parent.addView(button(getString(R.string.open_car_wi_fi_settings), false) { openCarClientWifiSettings() }, matchButton(12, 60))
            parent.addView(button(getString(R.string.existing_wifi_details), false) {
                askHotspotCredentials(existingWifi = true) { ssid, password, _, _ ->
                    AirPlayPersistence.saveExistingWifiCredentials(this, ssid, password)
                    toast(getString(R.string.saved_for_your_next_connection))
                }
            }, matchButton(12, 60))
            // The networks worth joining, right here on the page: what 车机互联 remembers
            // from before, then what the car can hear. Picking one saves it and uses it,
            // so a name and password are only typed when the network is new.
            val remembered = AirPlayPersistence.loadWifiChoices(this)
            val audible = net.easyconn.gwmec.network.WifiNetworkPicker.around(this)
                .filter { network -> remembered.none { it.first == network.ssid } }
            val offered = remembered.map { it.first to it.second } + audible.map { it.ssid to "" }
            if (offered.isNotEmpty()) {
                parent.addView(label(getString(R.string.pick_a_saved_network), 15, ACCENT, true).apply {
                    setPadding(0, dp(14), 0, dp(6))
                })
                offered.forEach { (name, secret) ->
                    parent.addView(button(name, false) {
                        if (secret.isEmpty()) {
                            // Known by name only: the password still has to be typed once.
                            askHotspotCredentials(existingWifi = true) { ssid, password, _, _ ->
                                AirPlayPersistence.saveExistingWifiCredentials(this, ssid, password)
                                pendingCarHotspotSetup = false
                                applyWirelessLink(WirelessHotspotMode.EXISTING_WIFI)
                            }
                        } else {
                            AirPlayPersistence.saveExistingWifiCredentials(this, name, secret)
                            pendingCarHotspotSetup = false
                            applyWirelessLink(WirelessHotspotMode.EXISTING_WIFI)
                            toast(getString(R.string.saved_for_your_next_connection))
                        }
                    }, matchButton(6, 52))
                }
            }
        } else {
            parent.addView(label(getString(R.string.turn_the_car_s_wi_fi_switch_on_allow_location_nearby_devic), 16, MUTED))
            wifiDirectChannelControl(parent)
            parent.addView(button(getString(R.string.open_car_wi_fi_settings), false) { openCarClientWifiSettings() }, matchButton(12, 60))
        }
    }

    private fun wifiDirectChannelLabel(channel: Int): String = if (channel == WifiP2pChannels.AUTO) {
        getString(R.string.auto)
    } else if (channel == WifiP2pChannels.AUTO_5_GHZ || channel == WifiP2pChannels.AUTO_2_4_GHZ) {
        getString(R.string.settings_wifi_direct_auto_band,
            getString(if (channel == WifiP2pChannels.AUTO_5_GHZ) R.string.s_5_ghz else R.string.s_2_4_ghz))
    } else {
        getString(R.string.wifi_direct_channel_choice, channel,
            getString(if (channel < 36) R.string.s_2_4_ghz else R.string.s_5_ghz))
    }

    private fun wifiDirectChannelControl(parent: LinearLayout) {
        val summary: (Int) -> String = {
            getString(R.string.wifi_direct_channel_summary, wifiDirectChannelLabel(it))
        }
        val control = button(summary(AirPlayPersistence.loadWifiP2pPreferredChannel(this)), false) {}
        control.setOnClickListener {
            val choices = listOf(WifiP2pChannels.AUTO) + WifiP2pChannels.bandChoices + WifiP2pChannels.channels
            val current = AirPlayPersistence.loadWifiP2pPreferredChannel(this)
            var selection = current
            appDialogBuilder().setTitle(R.string.wifi_direct_channel_title)
                .setSingleChoiceItems(choices.map(::wifiDirectChannelLabel).toTypedArray(),
                    choices.indexOf(current)) { _, which -> selection = choices[which] }
                .setPositiveButton(R.string.save) { _, _ ->
                    if (selection != current) {
                        AirPlayPersistence.saveWifiP2pPreferredChannel(this, selection)
                        control.text = summary(selection)
                        toast(getString(R.string.saved_for_your_next_connection))
                    }
                }
                .setNegativeButton(R.string.cancel, null)
                .show()
        }
        parent.addView(control, matchButton(12, 60))
        parent.addView(label(getString(R.string.wifi_direct_channel_description), 15, MUTED).apply {
            setPadding(0, dp(6), 0, dp(6))
        })
        parent.addView(label(getString(R.string.settings_wifi_direct_band_note), 15, MUTED).apply {
            setPadding(0, 0, 0, dp(12))
        })
    }

    private fun mediaChannelControl(parent: LinearLayout) {
        val summary: (Int) -> String = {
            getString(R.string.contrib_audio_home_choice_summary, getString(R.string.contrib_audio_home_media_channel_label), channelLabel(it))
        }
        val control = button(summary(AirPlayPersistence.loadMediaAudioChannel(this)), false) {}
        control.setOnClickListener {
            val current = AirPlayPersistence.loadMediaAudioChannel(this)
            showChannelDialog(
                title = getString(R.string.contrib_audio_home_media_channel_label),
                current = current,
                navigation = false,
                onApply = { value -> applyMediaChannel(value, current, control, summary) },
            )
        }
        parent.addView(control, matchButton(12, 60))
    }

    private fun navigationChannelControl(parent: LinearLayout) {
        val summary: (Int) -> String = {
            getString(R.string.contrib_audio_home_choice_summary, getString(R.string.contrib_audio_home_nav_channel_label), channelLabel(it))
        }
        val control = button(summary(AirPlayPersistence.loadNavigationAudioChannel(this)), false) {}
        control.setOnClickListener {
            val current = AirPlayPersistence.loadNavigationAudioChannel(this)
            showChannelDialog(
                title = getString(R.string.contrib_audio_home_nav_channel_label),
                current = current,
                navigation = true,
                onApply = { value -> applyNavigationChannel(value, current, control, summary) },
            )
        }
        parent.addView(control, matchButton(10, 60))
        parent.addView(label(getString(R.string.contrib_audio_home_nav_channel_note), 14, MUTED).apply {
            setPadding(0, dp(8), 0, dp(18))
        })
    }

    private fun showChannelDialog(title: String, current: Int, navigation: Boolean, onApply: (Int) -> Unit) {
        val preview = AudioChannelPreview { channel ->
            toast(getString(R.string.contrib_audio_home_channel_preview_unavailable, channel))
        }
        val channels = AirPlayPersistence.AUDIO_CHANNELS
        val labels = channels.map(Int::toString).toTypedArray()
        var selection = current.coerceIn(channels.first, channels.last)
        appDialogBuilder().setTitle(title)
            .setSingleChoiceItems(labels, selection) { _, which ->
                selection = which
                preview.play(which, navigation)
            }
            .setPositiveButton(if (CarPlayBackgroundSession.hasSession()) getString(R.string.apply_and_reconnect) else getString(R.string.save)) { _, _ ->
                onApply(selection)
            }
            .setNegativeButton(getString(R.string.cancel), null)
            .setOnDismissListener { preview.close() }
            .show()
    }

    private fun applyMediaChannel(value: Int, previous: Int, control: Button, summary: (Int) -> String) {
        if (value == previous) return
        AirPlayPersistence.saveMediaAudioChannel(this, value)
        control.text = summary(value)
        if (CarPlayBackgroundSession.hasSession()) connect(AirPlayPersistence.loadWirelessEnabled(this))
    }

    private fun applyNavigationChannel(value: Int, previous: Int, control: Button, summary: (Int) -> String) {
        if (value == previous) return
        AirPlayPersistence.saveNavigationAudioChannel(this, value)
        control.text = summary(value)
        if (CarPlayBackgroundSession.hasSession()) connect(AirPlayPersistence.loadWirelessEnabled(this))
    }

    private fun channelLabel(value: Int): String = value.toString()

    private fun storedSsid() = AirPlayPersistence.loadManualHotspotSsid(this)
    private fun storedPassword() = AirPlayPersistence.loadManualHotspotPassphrase(this)
    private fun hotspotError(ssid: String, password: String) =
        net.easyconn.gwmec.orchestration.ManualHotspotValidation.error(ssid, password)?.let { getString(it.messageResource()) }

    private fun saveHotspotCredentials(
        ssid: String,
        password: String,
        security: ManualHotspotSecurity,
        interfaceName: String = "",
    ) {
        AirPlayPersistence.saveManualHotspotSsid(this, ssid)
        AirPlayPersistence.saveManualHotspotPassphrase(this, password)
        AirPlayPersistence.saveManualHotspotSecurity(this, security)
        AirPlayPersistence.saveManualHotspotBand(this, net.easyconn.gwmec.orchestration.ManualHotspotBand.AUTO)
        AirPlayPersistence.saveManualHotspotChannel(this, 0)
        AirPlayPersistence.saveManualHotspotInterface(this, interfaceName)
        markReconnectNeeded()
    }

    private fun askHotspotCredentials(
        existingWifi: Boolean = false,
        done: (String, String, ManualHotspotSecurity, String) -> Unit,
    ) {
        val dialogContext = appDialogContext()
        val fields = column().apply { setPadding(dp(24), dp(12), dp(24), dp(12)) }
        fields.addView(label(getString(if (existingWifi) R.string.existing_wifi_instructions else R.string.copy_these_from_the_car_s_hotspot_settings_use_5_ghz_if_av), 16, MUTED))
        // Offer the names the car already knows: what 车机互联 remembered, then what the
        // device itself has a configuration for. Picking one fills the fields, so typing
        // stays as the fallback rather than the only way in.
        val ssid = EditText(dialogContext).apply {
            hint = getString(if (existingWifi) R.string.existing_wifi_ssid else R.string.hotspot_name)
            setText(if (existingWifi) AirPlayPersistence.loadExistingWifiSsid(this@CarlinkActivity) else storedSsid())
            setSingleLine()
        }
        val password = EditText(dialogContext).apply {
            hint = getString(if (existingWifi) R.string.existing_wifi_password else R.string.hotspot_password)
            setText(if (existingWifi) AirPlayPersistence.loadExistingWifiPassphrase(this@CarlinkActivity) else storedPassword())
            setSingleLine()
            inputType = android.text.InputType.TYPE_CLASS_TEXT or android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
        }
        if (existingWifi) {
            val remembered = AirPlayPersistence.loadWifiChoices(this)
            val nearby = net.easyconn.gwmec.network.WifiNetworkPicker.around(this)
                .filter { network -> remembered.none { it.first == network.ssid } }
            val offered = remembered.map { it.first to it.second } +
                nearby.map { it.ssid to "" }
            if (offered.isNotEmpty()) {
                fields.addView(label(getString(R.string.pick_a_saved_network), 15, ACCENT, true).apply {
                    setPadding(0, dp(12), 0, dp(6))
                })
                offered.forEach { (name, secret) ->
                    fields.addView(button(name, false) {
                        ssid.setText(name)
                        if (secret.isNotEmpty()) password.setText(secret)
                    }, matchButton(6, 52))
                }
            }
        }
        ssid.imeOptions = android.view.inputmethod.EditorInfo.IME_ACTION_NEXT or android.view.inputmethod.EditorInfo.IME_FLAG_NO_EXTRACT_UI
        password.imeOptions = android.view.inputmethod.EditorInfo.IME_ACTION_DONE or android.view.inputmethod.EditorInfo.IME_FLAG_NO_EXTRACT_UI
        fun hideKeyboard() {
            val token = password.windowToken ?: ssid.windowToken
            (this.getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager)
                .hideSoftInputFromWindow(token, 0)
            ssid.clearFocus(); password.clearFocus()
        }
        ssid.setOnEditorActionListener { _, action, _ ->
            if (action == android.view.inputmethod.EditorInfo.IME_ACTION_NEXT) { password.requestFocus(); true } else false
        }
        password.setOnEditorActionListener { _, action, _ ->
            if (action == android.view.inputmethod.EditorInfo.IME_ACTION_DONE) { hideKeyboard(); true } else false
        }
        fields.addView(ssid); fields.addView(password)
        val hotspotInterface = if (existingWifi) null else EditText(dialogContext).apply {
            hint = getString(R.string.settings_hotspot_interface)
            setText(AirPlayPersistence.loadManualHotspotInterface(this@CarlinkActivity))
            setSingleLine()
            inputType = android.text.InputType.TYPE_CLASS_TEXT
        }
        if (hotspotInterface != null) {
            fields.addView(hotspotInterface)
            fields.addView(label(getString(R.string.settings_hotspot_interface_description), 14, MUTED))
        }
        fields.addView(CheckBox(dialogContext).apply {
            text = getString(R.string.show_password)
            setOnCheckedChangeListener { _, checked ->
                password.transformationMethod = if (checked) null else android.text.method.PasswordTransformationMethod.getInstance()
                password.setSelection(password.text.length)
            }
        })
        val securityModes = listOf(ManualHotspotSecurity.WPA2, ManualHotspotSecurity.WPA3_TRANSITION, ManualHotspotSecurity.WPA3)
        val securityTitles = listOf(getString(R.string.wpa2), getString(R.string.wpa3_transition), getString(R.string.wpa3))
        var protectedSecurity = AirPlayPersistence.loadManualHotspotSecurity(this)
            .takeIf { it in securityModes } ?: ManualHotspotSecurity.WPA2
        if (!existingWifi) {
            lateinit var securityControl: Button
            fun updateSecurityControl() {
                val hasPassword = password.text.isNotEmpty()
                val title = if (hasPassword) securityTitles[securityModes.indexOf(protectedSecurity)] else getString(R.string.open)
                securityControl.text = "${getString(R.string.security)} · $title"
                securityControl.isEnabled = hasPassword
            }
            securityControl = button("", false) {
                var pendingSecurity = protectedSecurity
                appDialogBuilder().setTitle(getString(R.string.security))
                    .setSingleChoiceItems(securityTitles.toTypedArray(), securityModes.indexOf(protectedSecurity)) { _, index ->
                        pendingSecurity = securityModes[index]
                    }
                    .setPositiveButton(getString(R.string.save)) { _, _ ->
                        protectedSecurity = pendingSecurity
                        updateSecurityControl()
                    }.setNegativeButton(getString(R.string.cancel), null).show()
            }
            updateSecurityControl()
            password.addTextChangedListener(object : android.text.TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = Unit
                override fun afterTextChanged(s: android.text.Editable?) = updateSecurityControl()
            })
            fields.addView(securityControl, matchButton(12, 60))
            fields.addView(label(getString(R.string.saved_for_your_next_connection), 15, MUTED))
        }
        val error = label("", 14, WARNING)
        error.accessibilityLiveRegion = View.ACCESSIBILITY_LIVE_REGION_POLITE
        fields.addView(error)
        val dialog = appDialogBuilder().setTitle(getString(if (existingWifi) R.string.existing_wifi_details else R.string.car_hotspot_details))
            .setView(ScrollView(dialogContext).apply { addView(fields) })
            .setPositiveButton(getString(R.string.save_details), null).setNegativeButton(getString(R.string.cancel)) { _, _ -> hideKeyboard() }
            .setNeutralButton(getString(R.string.hide_keyboard), null).create()
        dialog.setOnShowListener {
            dialog.window?.setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
            dialog.getButton(android.app.AlertDialog.BUTTON_NEUTRAL).setOnClickListener { hideKeyboard() }
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                val name = if (existingWifi) ssid.text.toString() else ssid.text.toString().trim()
                val secret = password.text.toString()
                val problem = hotspotError(name, secret)
                if (problem != null) error.text = problem
                else {
                    val security = if (secret.isEmpty()) ManualHotspotSecurity.OPEN else protectedSecurity
                    val iface = hotspotInterface?.text?.toString()?.trim().orEmpty()
                    hideKeyboard(); dialog.dismiss(); done(name, secret, security, iface)
                }
            }
        }
        dialog.show()
    }





    private fun promptEnableUsbAutoConfirm() {
        if (UsbPermissionSetup.Permission.ACCESSIBILITY.granted(this)) {
            toast(getString(R.string.usb_auto_confirm_status_on))
            return
        }
        appDialogBuilder()
            .setTitle(getString(R.string.usb_auto_confirm_title))
            .setMessage(getString(R.string.usb_auto_confirm_dialog_msg))
            .setPositiveButton(getString(R.string.btn_auto_apply_permissions)) { _, _ ->
                autoApplyPermissions()
            }
            .setNeutralButton(getString(R.string.btn_open_accessibility_setting)) { _, _ ->
                if (!UsbAutoConfirmService.openSettings(this)) {
                    toast(getString(R.string.wheel_keys_no_settings))
                }
            }
            .setNegativeButton(getString(R.string.cancel)) { _, _ ->
                render()
            }
            .setOnCancelListener {
                render()
            }
            .show()
    }

    private fun cancelUsbPermissionSetup() {
        val operation = usbPermissionOperation
        usbPermissionOperation = null
        operation?.cancel()
        val dialog = usbPermissionDialog
        usbPermissionDialog = null
        dialog?.dismiss()
    }

    private fun autoApplyPermissions() {
        if (usbPermissionOperation != null || isFinishing || isDestroyed) return
        val operation = usbPermissionOperationFactory(applicationContext)
        usbPermissionOperation = operation
        val progress = appDialogBuilder()
            .setTitle(R.string.auto_grant_title)
            .setMessage(R.string.auto_grant_msg)
            .setNegativeButton(R.string.cancel) { _, _ -> cancelUsbPermissionSetup() }
            .create()
        usbPermissionDialog = progress
        progress.setOnCancelListener { cancelUsbPermissionSetup() }
        progress.setOnDismissListener {
            if (usbPermissionDialog === progress) cancelUsbPermissionSetup()
        }
        progress.show()
        Thread({
            val result = operation.run()
            handler.post {
                if (usbPermissionOperation !== operation || operation.isCancelled || isFinishing || isDestroyed) {
                    return@post
                }
                usbPermissionOperation = null
                usbPermissionDialog = null
                progress.dismiss()
                render()
                if (result.complete) {
                    appDialogBuilder()
                        .setTitle(R.string.auto_grant_success_title)
                        .setMessage(R.string.auto_grant_success_msg)
                        .setPositiveButton(R.string.close, null)
                        .show()
                } else {
                    val reason = when (result.access) {
                        LocalAdb.Access.NOT_APPROVED -> getString(R.string.auto_grant_confirm_msg)
                        LocalAdb.Access.UNSUPPORTED -> getString(R.string.adb_pairing_only)
                        else -> getString(R.string.auto_grant_incomplete)
                    }
                    showManualPermissionDialog(reason)
                }
            }
        }, "diplay-auto-permission").start()
    }

    private fun showManualPermissionDialog(reason: String) {
        val body = column().apply { setPadding(dp(20), dp(10), dp(20), dp(10)) }
        body.addView(label(reason, 15, MUTED).apply { setPadding(0, 0, 0, dp(12)) })

        val autoConfirmOn = UsbPermissionSetup.Permission.ACCESSIBILITY.granted(this)
        body.addView(button(if (autoConfirmOn) getString(R.string.usb_auto_confirm_status_on) else getString(R.string.btn_open_accessibility_setting), false) {
            if (!UsbAutoConfirmService.openSettings(this)) toast(getString(R.string.wheel_keys_no_settings))
        }, matchButton(0, 56))

        val overlayOn = CenterMapOverlay.permitted(this)
        body.addView(button(if (overlayOn) getString(R.string.center_map_overlay_allowed) else getString(R.string.btn_open_overlay_setting), false) {
            openOverlayPermission()
        }, matchButton(10, 56))

        UsbPermissionSetup.snapshot(this).forEach { (permission, granted) ->
            val title = getString(when (permission) {
                UsbPermissionSetup.Permission.ACCESSIBILITY -> R.string.usb_auto_confirm_title
                UsbPermissionSetup.Permission.USAGE -> R.string.center_map_auto_hide
                UsbPermissionSetup.Permission.OVERLAY -> R.string.btn_open_overlay_setting
            })
            body.addView(label("$title: ${getString(if (granted) R.string.permission_enabled_ready else R.string.permission_not_enabled)}", 14, if (granted) MUTED else WARNING))
        }
        val adbCmd = UsbPermissionSetup.manualCommand(packageName)
        body.addView(label(getString(R.string.manual_grant_cmd_hint), 14, MUTED).apply { setPadding(0, dp(12), 0, dp(6)) })
        body.addView(label(adbCmd, 13, TEXT).apply {
            typeface = Typeface.MONOSPACE
            setTextIsSelectable(true)
            setPadding(dp(8), dp(8), dp(8), dp(8))
            setBackgroundColor(BUTTON)
        })
        body.addView(button(getString(R.string.copy_command), false) {
            getSystemService(android.content.ClipboardManager::class.java).setPrimaryClip(
                android.content.ClipData.newPlainText("Carlink ADB Command", adbCmd)
            )
            toast(getString(R.string.copied_to_the_car_clipboard_run_the_command_on_your_comput))
        }, matchButton(8, 50))

        appDialogBuilder()
            .setTitle(getString(R.string.permissions_and_connection_help))
            .setView(ScrollView(appDialogContext()).apply { addView(body) })
            .setPositiveButton(getString(R.string.close)) { _, _ -> render() }
            .show()
    }

    /** Optional guidance-volume routing through the existing wheel service. */
    private fun navigationWheelControls(card: LinearLayout) {
        toggle(card, getString(R.string.settings_navigation_wheel_volume), getString(R.string.settings_navigation_wheel_volume_description),
            NavigationWheelSettings.enabled(this)) {
            NavigationWheelSettings.setEnabled(this, it)
            render()
        }
        if (!NavigationWheelSettings.enabled(this) || WheelKeyService.connected()) return
        card.addView(label(getString(R.string.settings_navigation_wheel_service_required), 14, WARNING))
        card.addView(button(getString(R.string.wheel_keys_open_settings), false) {
            if (!UsbAutoConfirmService.openSettings(this)) toast(getString(R.string.wheel_keys_no_settings))
        }, matchButton(10, 56))
        card.addView(button(getString(R.string.wheel_keys_enable_adb), false) {
            Thread({
                val access = WheelKeyService.enableOverAdb(this)
                runOnUiThread {
                    if (access != net.easyconn.gwmec.adb.LocalAdb.Access.READY) {
                        toast(getString(R.string.wheel_keys_adb_failed, access.name))
                    }
                    render()
                }
            }, "diplay-navigation-wheel-enable").start()
        }, matchButton(10, 56))
    }

    /** Steering-wheel keys for the dashboard map zoom and the CarPlay joystick: the switches, the key service and the keys. */
    // One place for the key service setup, above every feature that needs it.
    private fun wheelKeysSettings(card: LinearLayout) {
        // The joystick and map zoom use BYD's media and custom keys.
        val byd = CarHotspotSetup.isBydHeadUnit(this)
        val zoomAvailable = wheelMapZoomAvailable()
        val vehicleKeysOn = WheelZoomSettings.joystick(this) ||
            (zoomAvailable && WheelZoomSettings.enabled(this))
        if (WheelZoomSettings.siriKey(this) || vehicleKeysOn) wheelKeyServiceControls(card)
        siriKeyControls(card)
        // Any head unit: a paired keyboard, remote or rotary controller works alongside touch.
        toggle(card, getString(R.string.settings_external_controller), getString(R.string.settings_external_controller_description),
            AirPlayPersistence.loadExternalController(this)) { AirPlayPersistence.saveExternalController(this, it) }
        // Keep previously configured controls reachable even if package detection misses the car.
        if (byd || zoomAvailable || WheelZoomSettings.joystick(this)) wheelKeyControls(card)
    }

    // Map zoom only works where the dashboard map card used to show these controls.
    private fun wheelMapZoomAvailable(): Boolean {
        if (!AirPlayPersistence.loadClusterMapEnabled(this)) return false
        val adbCluster = AdbClusterRouter.enabled(this)
        if (DiLink51ClusterLayout.supported() && !adbCluster) return false
        return adbCluster || ClusterMapPresentation.findDisplay(this) != null
    }

    private fun wheelKeyControls(card: LinearLayout) {
        val zoomAvailable = wheelMapZoomAvailable()
        if (zoomAvailable) {
            toggle(card, getString(R.string.wheel_map_zoom), getString(R.string.wheel_map_zoom_description),
                WheelZoomSettings.enabled(this)) {
                WheelZoomSettings.setEnabled(this, it)
                render()
            }
        }
        toggle(card, getString(R.string.wheel_joystick), getString(R.string.wheel_joystick_description),
            WheelZoomSettings.joystick(this)) {
            WheelZoomSettings.setJoystick(this, it)
            render()
        }
        val zoom = zoomAvailable && WheelZoomSettings.enabled(this)
        val joystick = WheelZoomSettings.joystick(this)
        if (!zoom && !joystick) return
        if (zoom) {
            val behaviours = WheelZoomSettings.Behaviour.entries
            choice(card, getString(R.string.wheel_zoom_behaviour),
                listOf(getString(R.string.wheel_zoom_behaviour_toggle), getString(R.string.wheel_zoom_behaviour_timed)),
                behaviours.indexOf(WheelZoomSettings.behaviour(this)), reconnects = false) {
                WheelZoomSettings.setBehaviour(this, behaviours[it])
            }
        }
        if (joystick) {
            toggle(card, getString(R.string.wheel_joystick_auto_off), getString(R.string.wheel_joystick_auto_off_description),
                WheelZoomSettings.joystickAutoOff(this)) { WheelZoomSettings.setJoystickAutoOff(this, it) }
        }
        for (role in WheelZoomSettings.Role.entries) {
            // A key can serve both: the mode key goes back in the joystick, the zoom keys move it.
            val zoomName = when (role) {
                WheelZoomSettings.Role.MODE -> R.string.wheel_key_role_mode
                WheelZoomSettings.Role.ZOOM_IN -> R.string.wheel_key_role_zoom_in
                WheelZoomSettings.Role.ZOOM_OUT -> R.string.wheel_key_role_zoom_out
                else -> null
            }.takeIf { zoom }
            val joystickName = when (role) {
                WheelZoomSettings.Role.MODE -> R.string.wheel_key_role_back
                WheelZoomSettings.Role.ZOOM_IN, WheelZoomSettings.Role.PREVIOUS -> R.string.wheel_key_role_previous
                WheelZoomSettings.Role.ZOOM_OUT, WheelZoomSettings.Role.NEXT -> R.string.wheel_key_role_next
                WheelZoomSettings.Role.JOYSTICK -> R.string.wheel_key_role_joystick
                WheelZoomSettings.Role.SELECT -> R.string.wheel_key_role_select
                WheelZoomSettings.Role.SIRI -> null
                WheelZoomSettings.Role.MEDIA_PLAY_PAUSE -> null
            }.takeIf { joystick }
            val names = listOfNotNull(zoomName, joystickName)
            if (names.isEmpty()) continue
            wheelKeyAssignButton(card, role, names.joinToString(" · ") { getString(it) })
        }
    }

    /** A wheel key that opens Siri on any car whose key reaches the key service. */
    private fun siriKeyControls(card: LinearLayout) {
        toggle(card, getString(R.string.wheel_siri_key), getString(R.string.wheel_siri_key_description),
            WheelZoomSettings.siriKey(this)) {
            WheelZoomSettings.setSiriKey(this, it)
            render()
        }
        if (WheelZoomSettings.siriKey(this)) {
            toggle(card, getString(R.string.wheel_siri_double_press),
                getString(R.string.wheel_siri_double_press_description),
                WheelZoomSettings.siriDoublePress(this)) {
                WheelZoomSettings.setSiriDoublePress(this, it)
                render()
            }
            if (WheelZoomSettings.siriDoublePress(this)) {
                val intervals = WheelZoomSettings.SIRI_DOUBLE_PRESS_INTERVALS
                choice(card, getString(R.string.wheel_siri_double_press_interval),
                    intervals.map { getString(R.string.fps_counter_millis, it) },
                    intervals.indexOf(WheelZoomSettings.siriDoublePressIntervalMillis(this)), reconnects = false) {
                    WheelZoomSettings.setSiriDoublePressIntervalMillis(this, intervals[it])
                }
                val delays = WheelZoomSettings.SIRI_TRIGGER_DELAYS
                choice(card, getString(R.string.wheel_siri_trigger_delay),
                    delays.map { getString(R.string.fps_counter_millis, it) },
                    delays.indexOf(WheelZoomSettings.siriTriggerDelayMillis(this)), reconnects = false) {
                    WheelZoomSettings.setSiriTriggerDelayMillis(this, delays[it])
                }
            }
            wheelKeyAssignButton(card, WheelZoomSettings.Role.SIRI, getString(R.string.wheel_key_role_siri))
        }
        toggle(card, getString(R.string.wheel_media_play_pause),
            getString(R.string.wheel_media_play_pause_description),
            WheelZoomSettings.mediaPlayPause(this)) {
            WheelZoomSettings.setMediaPlayPause(this, it)
            render()
        }
        if (WheelZoomSettings.mediaPlayPause(this)) {
            wheelKeyAssignButton(card, WheelZoomSettings.Role.MEDIA_PLAY_PAUSE,
                getString(R.string.wheel_key_role_media_play_pause))
        }
    }

    private fun wheelKeyServiceControls(card: LinearLayout) {
        val connected = WheelKeyService.connected()
        card.addView(label(getString(when {
            connected -> R.string.wheel_keys_service_on
            WheelKeyService.enabledInSettings(this) -> R.string.wheel_keys_service_starting
            else -> R.string.wheel_keys_service_off
        }), 14, if (connected) MUTED else WARNING))
        if (!connected) {
            card.addView(actionButton(getString(R.string.wheel_keys_enable_adb), false) {
                Thread({
                    val access = WheelKeyService.enableOverAdb(this)
                    runOnUiThread {
                        if (access != net.easyconn.gwmec.adb.LocalAdb.Access.READY) {
                            toast(getString(R.string.wheel_keys_adb_failed, access.name))
                        }
                        render()
                    }
                }, "diplay-wheel-keys-enable").start()
            }, matchButton(10, 56))
            card.addView(button(getString(R.string.wheel_keys_open_settings), false) {
                if (!UsbAutoConfirmService.openSettings(this)) toast(getString(R.string.wheel_keys_no_settings))
            }, matchButton(10, 56))
        }
    }

    private fun wheelKeyAssignButton(card: LinearLayout, role: WheelZoomSettings.Role, name: String) {
        fun current(key: WheelKey? = WheelZoomSettings.key(this, role)) =
            getString(R.string.wheel_key_assign, name, key?.toString() ?: getString(R.string.wheel_key_none))
        lateinit var assign: android.widget.Button
        assign = button(current(), false) {
            val cancelled = { runOnUiThread {
                assign.text = current()
                applyPendingAppearanceRender()
            } }
            val refused = { taken: WheelZoomSettings.Role ->
                runOnUiThread {
                    assign.text = current()
                    toast(getString(R.string.wheel_key_in_use, getString(wheelKeyRoleName(taken))))
                    applyPendingAppearanceRender()
                }
            }
            val started = WheelKeyService.learn(role, cancelled, refused) { _, key -> runOnUiThread {
                assign.text = current(key)
                applyPendingAppearanceRender()
            } } ||
                // Without the service, keys that reach this window can still be learnt.
                ((role == WheelZoomSettings.Role.SIRI ||
                    role == WheelZoomSettings.Role.MEDIA_PLAY_PAUSE) && learnInWindow(role, cancelled, refused) {
                    assign.text = current(it)
                    applyPendingAppearanceRender()
                })
            if (started) assign.text = getString(R.string.wheel_key_press, name)
            else toast(getString(R.string.wheel_keys_service_off))
        }
        card.addView(assign, matchButton(10, 56))
    }

    private fun wheelKeyRoleName(role: WheelZoomSettings.Role): Int = when (role) {
        WheelZoomSettings.Role.MODE -> R.string.wheel_key_role_mode
        WheelZoomSettings.Role.ZOOM_IN -> R.string.wheel_key_role_zoom_in
        WheelZoomSettings.Role.ZOOM_OUT -> R.string.wheel_key_role_zoom_out
        WheelZoomSettings.Role.JOYSTICK -> R.string.wheel_key_role_joystick
        WheelZoomSettings.Role.PREVIOUS -> R.string.wheel_key_role_previous
        WheelZoomSettings.Role.NEXT -> R.string.wheel_key_role_next
        WheelZoomSettings.Role.SELECT -> R.string.wheel_key_role_select
        WheelZoomSettings.Role.SIRI -> R.string.wheel_key_role_siri
        WheelZoomSettings.Role.MEDIA_PLAY_PAUSE -> R.string.wheel_key_role_media_play_pause
    }

    private class WindowKeyLearning(
        val role: WheelZoomSettings.Role,
        val cancelled: () -> Unit,
        val refused: (WheelZoomSettings.Role) -> Unit,
        val done: (WheelKey) -> Unit,
    )

    private fun learnInWindow(role: WheelZoomSettings.Role, cancelled: () -> Unit,
        refused: (WheelZoomSettings.Role) -> Unit, done: (WheelKey) -> Unit): Boolean {
        cancelKeyLearning()
        windowLearning = WindowKeyLearning(role, cancelled, refused, done)
        handler.postDelayed(endWindowLearning, WheelKeyService.LEARNING_TIMEOUT_MILLIS)
        return true
    }

    private fun cancelKeyLearning() {
        WheelKeyService.cancelLearning()
        handler.removeCallbacks(endWindowLearning)
        val cancelled = windowLearning?.cancelled
        windowLearning = null
        cancelled?.invoke()
        applyPendingAppearanceRender()
    }

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        if (event.action != KeyEvent.ACTION_DOWN && event.action != KeyEvent.ACTION_UP) return super.dispatchKeyEvent(event)
        val action = windowLearningPresses.filter(
            Triple(event.deviceId, event.keyCode, event.scanCode),
            event.action == KeyEvent.ACTION_DOWN, event.repeatCount == 0,
        ) {
            val learning = windowLearning
            if (learning == null || event.keyCode == KeyEvent.KEYCODE_BACK) return@filter WheelZoomKeys.Action.PASS
            if (learning.role == WheelZoomSettings.Role.MEDIA_PLAY_PAUSE &&
                CarPlayRemoteKeys.isProtectedNavigationKey(event.keyCode)) {
                toast(getString(R.string.wheel_media_navigation_reserved))
                return@filter WheelZoomKeys.Action.CONSUME
            }
            val enabled = when (learning.role) {
                WheelZoomSettings.Role.SIRI -> WheelZoomSettings.siriKey(this)
                WheelZoomSettings.Role.MEDIA_PLAY_PAUSE -> WheelZoomSettings.mediaPlayPause(this)
                else -> false
            }
            if (inCall(this) || !enabled) {
                cancelKeyLearning()
                return@filter WheelZoomKeys.Action.PASS
            }
            handler.removeCallbacks(endWindowLearning)
            windowLearning = null
            val key = WheelKey.of(event)
            val taken = WheelZoomSettings.conflict(this, learning.role, key)
            if (taken != null) {
                Log.i(WheelKeyService.TAG, "${learning.role} key $key refused: it is the $taken key (learnt without the service)")
                learning.refused(taken)
            } else {
                WheelZoomSettings.assign(this, learning.role, key)
                Log.i(WheelKeyService.TAG, "${learning.role} key is now $key (learnt without the service)")
                learning.done(key)
            }
            WheelZoomKeys.Action.CONSUME
        }
        return action != WheelZoomKeys.Action.PASS || super.dispatchKeyEvent(event)
    }

    /** The 0.2.9 Dashboard song setting, shown once: in the BYD navigation card, or under Advanced vehicle data. */
    private fun applyCallKeys(enabled: Boolean) {
        BydOutputSettings.setCarPlayCallControls(this, enabled)
        if (enabled && !WheelKeyService.connected()) {
            Thread({
                val access = WheelKeyService.enableOverAdb(this)
                if (access != net.easyconn.gwmec.adb.LocalAdb.Access.READY) {
                    runOnUiThread { toast(getString(R.string.wheel_keys_adb_failed, access.name)) }
                }
            }, "diplay-call-keys-enable").start()
        }
    }

    private fun applyCarPlayCalls(enabled: Boolean) {
        BydOutputSettings.setCarPlayCalls(this, enabled)
        if (enabled) checkAdbState(mayAsk = true)
        BydNavigationOutputs.carPlayCallsChanged(enabled)
    }

    private fun advancedVehicleData(card: LinearLayout) {
        val legacyMode = BydOutputSettings.legacyVehicleProbe(this)
        card.addView(label(getString(R.string.advanced_vehicle_data_description), 14, MUTED)
            .apply { setPadding(0, dp(12), 0, 0) })
        choice(
            card,
            getString(R.string.vehicle_data_mode),
            listOf(
                getString(R.string.vehicle_data_mode_default),
                getString(R.string.vehicle_data_mode_legacy),
            ),
            if (legacyMode) 1 else 0,
            reconnects = false,
            announcesReconnect = vehicleDataSwitchesOn(),
            // A switch during ADB work would be dropped by the running step.
            enabled = !adbSwitchChangePending && !vehicleAdbWorkInProgress(),
        ) { selectVehicleDataMode(it == 1) }
        if (!legacyMode) {
            defaultVehicleData(card)
            return
        }
        val capabilities = displayedVehicleCapabilities()
        val adbText = when {
            vehicleProbeAuthorizationInProgress -> getString(R.string.adb_checking_may_ask)
            adbCheckInProgress -> getString(if (adbCheckMayAsk)
                R.string.adb_checking_may_ask else R.string.adb_checking)
            vehicleProbeInProgress || automaticVehicleValidationInProgress ->
                getString(R.string.probing_vehicle_data)
            adbCheckFailed -> getString(R.string.adb_check_failed)
            adbAccessState == null && capabilities != null -> getString(R.string.vehicle_probe_saved_automatic)
            adbAccessState == null -> getString(R.string.adb_not_checked)
            else -> adbLinkStatusText(requireNotNull(adbAccessState))
        }
        val healthy = capabilities != null && !adbCheckFailed && vehicleProbeOutcome?.error == null &&
            pendingVehicleLostFields.isEmpty() &&
            (adbAccessState == null || adbAccessState == BydAdbAccess.State.READY)
        card.addView(label(adbText, 14, if (healthy) MUTED else WARNING)
            .apply { setPadding(0, dp(12), 0, 0) })
        if (capabilities != null) {
            showVehicleProbeResults(card, capabilities)
            showVehicleDataSettings(card, capabilities)
        }
        if (vehicleProbeAuthorizationInProgress || adbCheckInProgress ||
            vehicleProbeInProgress || automaticVehicleValidationInProgress) return
        vehicleProbeOutcome?.error?.let {
            card.addView(label(getString(R.string.vehicle_probe_failed, it), 14, WARNING)
                .apply { setPadding(0, dp(10), 0, 0) })
        }
        if (pendingVehicleLostFields.isNotEmpty()) {
            card.addView(label(
                getString(
                    R.string.vehicle_probe_lost_saved_fields,
                    localizedVehicleFields(pendingVehicleLostFields),
                ),
                14,
                WARNING,
            ).apply { setPadding(0, dp(10), 0, 0) })
            card.addView(button(getString(R.string.replace_saved_vehicle_data_anyway), false) {
                replaceSavedVehicleDataAnyway()
            }, matchButton(10, 56))
        }
        val needsUserAction = capabilities == null || adbCheckFailed || vehicleProbeOutcome?.error != null ||
            pendingVehicleLostFields.isNotEmpty() ||
            adbAccessState in setOf(BydAdbAccess.State.NOT_APPROVED, BydAdbAccess.State.ADB_OFF, BydAdbAccess.State.PAIRING_ONLY)
        if (needsUserAction) {
            val title = if (adbAccessState == BydAdbAccess.State.NOT_APPROVED) {
                R.string.request_adb_authorization
            } else if (capabilities == null) {
                R.string.probe_adb_and_vehicle_data
            } else {
                R.string.probe_vehicle_data_again
            }
            card.addView(button(getString(title), false) {
                probeVehicleData(mayAsk = true)
            }.apply { isEnabled = !adbSwitchChangePending && !adbCheckInProgress }, matchButton(10, 56))
        }
    }

    private fun defaultVehicleData(card: LinearLayout) {
        val adbText = when {
            vehicleProbeAuthorizationInProgress -> getString(R.string.adb_checking_may_ask)
            adbCheckInProgress -> getString(if (adbCheckMayAsk)
                R.string.adb_checking_may_ask else R.string.adb_checking)
            vehicleProbeInProgress -> getString(R.string.probing_vehicle_data)
            adbCheckFailed -> getString(R.string.adb_check_failed)
            adbAccessState == null -> getString(R.string.adb_not_checked)
            else -> adbLinkStatusText(requireNotNull(adbAccessState))
        }
        val healthy = !adbCheckFailed && vehicleProbeOutcome?.error == null &&
            (adbAccessState == null || adbAccessState == BydAdbAccess.State.READY)
        card.addView(label(adbText, 14, if (healthy) MUTED else WARNING)
            .apply { setPadding(0, dp(12), 0, 0) })
        val busy = vehicleProbeAuthorizationInProgress || adbCheckInProgress || vehicleProbeInProgress
        if (!busy && adbAccessState == BydAdbAccess.State.READY) {
            defaultVehicleStatus?.let { showDefaultVehicleReadings(card, it) }
        }
        vehicleProbeOutcome?.error?.let {
            card.addView(label(getString(R.string.vehicle_probe_failed, it), 14, WARNING)
                .apply { setPadding(0, dp(10), 0, 0) })
        }
        showVehicleDataSettings(card, capabilities = null)
        if (!busy) {
            card.addView(button(getString(R.string.check_adb_access), false) {
                checkAdbState(mayAsk = true)
            }.apply { isEnabled = !adbSwitchChangePending }, matchButton(10, 56))
        }
    }

    /** The last default-mode reads; a value an enabled switch needs is a warning when missing. */
    private fun showDefaultVehicleReadings(card: LinearLayout, status: BydAdbAccess.Status) {
        fun reading(value: String?, unreadable: Int, needed: Boolean) {
            val text = value ?: getString(unreadable).takeIf { needed } ?: return
            card.addView(label(text, 14, if (value != null) MUTED else WARNING))
        }
        val battery = status.batteryPercent?.let { percent ->
            status.rangeKm?.let { getString(R.string.adb_battery_reading, percent.roundToInt(), it) }
        }
        reading(battery, R.string.adb_battery_unreadable, BydOutputSettings.batteryToIphone(this))
        reading(status.speedKmh?.let { getString(R.string.adb_vehicle_speed_reading, it.roundToInt()) },
            R.string.adb_vehicle_speed_unreadable, BydOutputSettings.wheelSpeedToIphone(this))
        reading(status.gear?.let { getString(R.string.adb_vehicle_gear_reading, it.letter.toString()) },
            R.string.adb_vehicle_gear_unreadable,
            BydOutputSettings.wheelSpeedToIphone(this) || BydOutputSettings.videoWhileParked(this))
    }

    private fun selectVehicleDataMode(legacyMode: Boolean) {
        if (adbSwitchChangePending) return
        // A stale mode dialog must also invalidate a probe when the Boolean stays the same.
        synchronized(vehicleOperationLock) { vehicleProbeGeneration++ }
        vehicleProbeAuthorizationInProgress = false
        vehicleProbeInProgress = false
        if (!legacyMode) {
            cancelAutomaticVehicleValidationForUserOperation(resumeAfter = false)
            synchronized(vehicleOperationLock) {
                BydOutputSettings.setLegacyVehicleProbe(this, false)
            }
            vehicleProbeOutcome = null
            pendingVehicleReplacement = null
            pendingVehicleLostFields = emptySet()
            defaultVehicleStatus = null
            render()
            // The session was built from the legacy probe; apply once the default reads succeed.
            vehicleDataReconnectPending = vehicleDataSwitchesOn()
            if (vehicleDataReconnectPending) checkAdbState(mayAsk = true)
            return
        }
        if (BydVehicleFieldStore.load(this) == null) {
            probeVehicleData(mayAsk = true, activateLegacyModeOnSuccess = true)
            return
        }
        synchronized(vehicleOperationLock) {
            BydOutputSettings.setLegacyVehicleProbe(this, true)
        }
        vehicleProbeOutcome = null
        pendingVehicleReplacement = null
        pendingVehicleLostFields = emptySet()
        scheduleAutomaticVehicleValidation()
        render()
        // With every vehicle-data switch off, the mode changes nothing CarPlay was told.
        if (vehicleDataSwitchesOn()) reconnectForVehicleSetting()
    }

    // Probe results are saved before they are shown, so the saved snapshot is the newest without
    // trusting the clock.
    private fun displayedVehicleCapabilities(): BydVehicleCapabilities? =
        BydVehicleFieldStore.load(this) ?: vehicleProbeOutcome?.capabilities

    private fun localizedVehicleFields(fields: Set<BydVehicleField>): String = fields.map { field ->
        getString(when (field) {
            BydVehicleField.SPEED -> R.string.vehicle_field_speed
            BydVehicleField.GEAR -> R.string.vehicle_field_gear
            BydVehicleField.SOC, BydVehicleField.RANGE, BydVehicleField.REMAINING_KWH ->
                R.string.vehicle_field_battery
            BydVehicleField.BMS_STATE -> R.string.vehicle_field_charging
        })
    }.distinct().joinToString()

    private fun replaceSavedVehicleDataAnyway() {
        val candidate = pendingVehicleReplacement ?: return
        // Never over a snapshot saved since the comparison; a failed write is shown, not thrown.
        val error = runCatching {
            BydVehicleFieldStore.replaceAnyway(applicationContext, pendingVehicleReplacementExpected, candidate)
        }.fold(
            onSuccess = { replaced -> if (replaced) null else getString(R.string.vehicle_probe_snapshot_changed) },
            onFailure = { it.message ?: it.javaClass.simpleName },
        )
        Log.i(BYD_VEHICLE_TAG, "user replaced saved vehicle data error=${error ?: "none"}")
        pendingVehicleReplacement = null
        pendingVehicleLostFields = emptySet()
        vehicleProbeOutcome = error?.let { BydVehicleProbeOutcome(BydAdbAccess.State.READY, error = it) }
        render()
    }

    private fun showVehicleProbeResults(card: LinearLayout, capabilities: BydVehicleCapabilities) {
        val catalogFields = capabilities.fields.values.count { it.address?.source == BydFieldSource.FIRMWARE }
        card.addView(label(getString(if (capabilities.catalogAvailable)
            R.string.vehicle_probe_catalog_ready else R.string.vehicle_probe_catalog_fallback, catalogFields),
            14, if (capabilities.catalogAvailable) MUTED else WARNING).apply { setPadding(0, dp(14), 0, 0) })

        val speed = capabilities.result(BydVehicleField.SPEED)
        val speedValue = speed.value
        val speedText = when {
            speedValue != null -> getString(R.string.adb_vehicle_speed_reading, speedValue.roundToInt())
            speed.supported -> getString(R.string.vehicle_probe_cached_supported, getString(R.string.vehicle_field_speed))
            else -> getString(R.string.adb_vehicle_speed_unreadable)
        }
        card.addView(label(speedText, 14, if (speed.supported) MUTED else WARNING))
        val gear = capabilities.result(BydVehicleField.GEAR)
        val gearValue = gear.value
        val gearText = when {
            gearValue != null -> getString(R.string.adb_vehicle_gear_reading, gearLetter(gearValue.toInt()))
            gear.supported -> getString(R.string.vehicle_probe_cached_supported, getString(R.string.vehicle_field_gear))
            else -> getString(R.string.adb_vehicle_gear_unreadable)
        }
        card.addView(label(gearText, 14, if (gear.supported) MUTED else WARNING))

        if (capabilities.batterySupported) {
            val percentValue = capabilities.result(BydVehicleField.SOC).value
            val rangeValue = capabilities.result(BydVehicleField.RANGE).value
            val energy = capabilities.result(BydVehicleField.REMAINING_KWH).value
            card.addView(label(if (percentValue == null || rangeValue == null) {
                getString(R.string.vehicle_probe_cached_supported, getString(R.string.vehicle_field_battery))
            } else if (energy != null) {
                getString(R.string.vehicle_probe_battery_reading,
                    percentValue.roundToInt(), rangeValue.roundToInt(), energy)
            } else {
                getString(R.string.vehicle_probe_battery_without_energy,
                    percentValue.roundToInt(), rangeValue.roundToInt())
            }, 14, if (energy != null || percentValue == null) MUTED else WARNING))
        } else {
            card.addView(label(getString(R.string.adb_battery_unreadable), 14, WARNING))
        }
        val charging = capabilities.result(BydVehicleField.BMS_STATE)
        val chargingValue = charging.value
        val chargingText = when {
            chargingValue != null -> getString(R.string.vehicle_probe_charging_state, chargingValue.toInt())
            charging.supported -> getString(R.string.vehicle_probe_cached_supported, getString(R.string.vehicle_field_charging))
            else -> getString(R.string.vehicle_probe_charging_unreadable)
        }
        card.addView(label(chargingText, 14, if (charging.supported) MUTED else WARNING))
    }

    private fun showVehicleDataSettings(card: LinearLayout, capabilities: BydVehicleCapabilities?) {
        toggle(card, getString(R.string.bt_suspend_during_carplay), getString(R.string.bt_suspend_during_carplay_description),
            AirPlayPersistence.loadBtSuspendDuringCarplay(this), enabled = !adbSwitchChangePending) {
            AirPlayPersistence.saveBtSuspendDuringCarplay(this, it)
            markReconnectNeeded()
            if (it) checkAdbState(mayAsk = true)
        }
        if (AirPlayPersistence.loadBtSuspendDuringCarplay(this)) {
            val delays = listOf(5, 10, 15, 30)
            choice(card, getString(R.string.bt_suspend_delay), delays.map { getString(R.string.bt_suspend_delay_option, it) },
                delays.indexOf(AirPlayPersistence.loadBtSuspendDelaySeconds(this)).coerceAtLeast(0), reconnects = false) {
                AirPlayPersistence.saveBtSuspendDelaySeconds(this, delays[it])
                markReconnectNeeded()
            }
        }
        if (capabilities == null || capabilities.batterySupported) {
            toggle(card, getString(R.string.car_battery_for_the_iphone),
                getString(R.string.car_battery_for_the_iphone_description),
                BydOutputSettings.batteryToIphone(this), enabled = !adbSwitchChangePending) {
                BydOutputSettings.setBatteryToIphone(this, it)
                onVehicleDataSettingChanged(it)
            }
            val connectors = EvChargingConnectors.entries
            choice(card, getString(R.string.charging_connectors), connectors.map { it.localizedLabel(this) },
                connectors.indexOf(BydOutputSettings.chargingConnectors(this))) {
                BydOutputSettings.setChargingConnectors(this, connectors[it])
            }
            val lowCharge = BydOutputSettings.lowChargePresets
            choice(card, getString(R.string.low_charge_warning), lowCharge.map {
                    getString(if (it == BydOutputSettings.DEFAULT_LOW_CHARGE_PERCENT)
                        R.string.percent_default else R.string.percent_value, it)
                }, lowCharge.indexOf(BydOutputSettings.lowChargePercent(this)).coerceAtLeast(0), reconnects = false) {
                BydOutputSettings.setLowChargePercent(this, lowCharge[it])
            }
        }
        if (capabilities == null || capabilities.motionSupported) {
            toggle(card, getString(R.string.wheel_speed_for_tunnels),
                getString(R.string.wheel_speed_for_tunnels_description),
                BydOutputSettings.wheelSpeedToIphone(this), enabled = !adbSwitchChangePending) {
                BydOutputSettings.setWheelSpeedToIphone(this, it)
                onVehicleDataSettingChanged(it)
            }
        }
        if (capabilities == null || capabilities.gearSupported) {
            toggle(card, getString(R.string.video_while_parked),
                getString(R.string.video_while_parked_description),
                BydOutputSettings.videoWhileParked(this), enabled = !adbSwitchChangePending) {
                BydOutputSettings.setVideoWhileParked(this, it)
                onVehicleDataSettingChanged(it)
            }
        }
    }

    private fun onVehicleDataSettingChanged(enabled: Boolean) {
        if (!enabled) {
            reconnectForVehicleSetting()
        } else if (BydOutputSettings.legacyVehicleProbe(this)) {
            scheduleAutomaticVehicleValidation()
            reconnectForVehicleSetting()
        } else {
            // Default mode applies the switch once a check reads what the enabled switches need.
            vehicleDataReconnectPending = true
            checkAdbState(mayAsk = true)
        }
    }

    // The approval dialog can open only after an explicit user action.
    private fun checkAdbState(mayAsk: Boolean) {
        if (adbSwitchChangePending || vehicleAdbWorkInProgress()) return
        val legacy = BydOutputSettings.legacyVehicleProbe(this)
        // Only a validation this check interrupts runs again; a Dashboard switch needs no vehicle check.
        cancelAutomaticVehicleValidationForUserOperation(
            resumeAfter = automaticVehicleValidationInProgress || automaticVehicleValidationPending,
        )
        val generation = ++adbCheckGeneration
        adbCheckInProgress = true
        adbCheckMayAsk = mayAsk
        adbCheckFailed = false
        render()
        val backend = BydVehicleSettingsBackendProvider.current
        backend.execute("diplay-adb-state") {
            val result = runCatching {
                if (legacy) {
                    BydAdbAccess.Status(backend.checkState(applicationContext, mayAsk))
                } else {
                    // The default battery path must publish its first sample before CarPlay reconnects.
                    backend.check(applicationContext, mayAsk)
                }
            }
            runOnUiThread {
                val current = generation == adbCheckGeneration
                if (current) {
                    adbCheckInProgress = false
                    adbCheckMayAsk = false
                }
                if (!current || isFinishing || isDestroyed) return@runOnUiThread
                adbCheckFailed = result.isFailure
                val status = result.getOrNull()
                adbAccessState = status?.state
                if (!legacy) defaultVehicleStatus = status
                if (!legacy && adbAccessState == BydAdbAccess.State.READY) {
                    vehicleProbeOutcome = null
                }
                render()
                // Unreadable data keeps the current connection; the page shows what is missing.
                if (!legacy && vehicleDataReconnectPending && status?.state == BydAdbAccess.State.READY &&
                    enabledVehicleDataReadable(null, status)) {
                    vehicleDataReconnectPending = false
                    reconnectForVehicleSetting()
                }
                runPendingAutomaticVehicleValidation()
            }
        }
    }

    /** First probe or user retry: one click handles ADB authorization, probing and persistence. */
    private fun probeVehicleData(mayAsk: Boolean) =
        probeVehicleData(mayAsk, activateLegacyModeOnSuccess = false)

    private fun probeVehicleData(mayAsk: Boolean, activateLegacyModeOnSuccess: Boolean) {
        if (adbSwitchChangePending || vehicleAdbWorkInProgress()) return
        val expectedLegacyMode = BydOutputSettings.legacyVehicleProbe(this)
        val expectedSnapshot = cancelAutomaticVehicleValidationForUserOperation(resumeAfter = false)
        val generation = ++vehicleProbeGeneration
        vehicleProbeAuthorizationInProgress = mayAsk
        vehicleProbeInProgress = !mayAsk
        adbCheckFailed = false
        pendingVehicleReplacement = null
        pendingVehicleLostFields = emptySet()
        Log.i(BYD_VEHICLE_TAG, "user vehicle probe starting mayAsk=$mayAsk")
        render()
        val backend = BydVehicleSettingsBackendProvider.current
        backend.execute("diplay-byd13-probe") {
            val app = applicationContext
            val attempt = runCatching {
                val access = backend.checkState(app, mayAsk)
                if (access != BydAdbAccess.State.READY) {
                    VehicleProbeAttempt(BydVehicleProbeOutcome(access))
                } else {
                    runOnUiThread {
                        if (generation == vehicleProbeGeneration && !isFinishing && !isDestroyed) {
                            vehicleProbeAuthorizationInProgress = false
                            vehicleProbeInProgress = true
                            render()
                        }
                    }
                    var candidate = backend.probe(app, persist = false)
                    if (candidate.access == BydAdbAccess.State.NOT_APPROVED) {
                        // adbd confirms "Always allow" before it saves the key, so this new connection can be early.
                        Log.i(BYD_VEHICLE_TAG, "probe connection not approved yet; retrying once")
                        Thread.sleep(ADB_KEY_SAVE_WAIT_MILLIS)
                        candidate = backend.probe(app, persist = false)
                    }
                    val candidateCapabilities = candidate.capabilities
                    when {
                        candidate.access == BydAdbAccess.State.NOT_APPROVED -> VehicleProbeAttempt(
                            outcome = candidate,
                            allowedOnlyOnce = true,
                        )
                        candidateCapabilities == null -> VehicleProbeAttempt(candidate)
                        else -> {
                            // Invalidation must guard persistence/publication, not only the UI callback.
                            val replacement = synchronized(vehicleOperationLock) {
                                if (generation != vehicleProbeGeneration ||
                                    BydOutputSettings.legacyVehicleProbe(app) != expectedLegacyMode) null
                                else BydVehicleFieldStore.replaceAutomatically(
                                    app,
                                    expectedSnapshot,
                                    candidateCapabilities,
                                )
                            } ?: return@runCatching VehicleProbeAttempt(
                                outcome = BydVehicleProbeOutcome(candidate.access),
                                snapshotChanged = true,
                            )
                            when {
                                replacement.saved -> VehicleProbeAttempt(candidate)
                                replacement.snapshotChanged -> VehicleProbeAttempt(
                                    outcome = candidate,
                                    snapshotChanged = true,
                                )
                                else -> VehicleProbeAttempt(
                                    outcome = BydVehicleProbeOutcome(candidate.access),
                                    heldCandidate = candidateCapabilities,
                                    lostFields = replacement.lostFields,
                                )
                            }
                        }
                    }
                }
            }.getOrElse { error ->
                VehicleProbeAttempt(
                    BydVehicleProbeOutcome(
                        BydAdbAccess.State.READY,
                        error = error.message ?: error.javaClass.simpleName,
                    ),
                )
            }
            runOnUiThread {
                val current = generation == vehicleProbeGeneration
                if (current) {
                    vehicleProbeAuthorizationInProgress = false
                    vehicleProbeInProgress = false
                }
                if (!current || isFinishing || isDestroyed) return@runOnUiThread
                pendingVehicleReplacement = attempt.heldCandidate
                pendingVehicleReplacementExpected = expectedSnapshot
                pendingVehicleLostFields = attempt.lostFields
                vehicleProbeOutcome = when {
                    attempt.allowedOnlyOnce -> attempt.outcome.copy(
                        error = getString(R.string.vehicle_probe_allowed_once),
                    )
                    attempt.snapshotChanged -> attempt.outcome.copy(
                        capabilities = null,
                        error = getString(R.string.vehicle_probe_snapshot_changed),
                    )
                    else -> attempt.outcome
                }
                adbAccessState = attempt.outcome.access
                val activatedLegacyMode = activateLegacyModeOnSuccess &&
                    vehicleProbeOutcome?.capabilities != null
                if (activatedLegacyMode) {
                    BydOutputSettings.setLegacyVehicleProbe(this, true)
                }
                if (vehicleProbeOutcome?.capabilities != null) automaticVehicleValidationStarted = true
                Log.i(
                    BYD_VEHICLE_TAG,
                    "user vehicle probe access=${attempt.outcome.access} " +
                        "saved=${vehicleProbeOutcome?.capabilities != null} " +
                        "lost=${attempt.lostFields.joinToString()} " +
                        "error=${vehicleProbeOutcome?.error ?: "none"}",
                )
                render()
                if (activatedLegacyMode && vehicleDataSwitchesOn()) reconnectForVehicleSetting()
                runPendingAutomaticVehicleValidation()
            }
        }
    }

    /**
     * After the first saved probe, validation is automatic and never asks for authorization. ADB
     * transport failure keeps the saved snapshot; only two complete READY-but-unreadable checks
     * trigger one automatic field re-probe.
     */
    private fun validateSavedVehicleConfigurationAutomatically() {
        if (!BydOutputSettings.legacyVehicleProbe(this)) return
        val saved = BydVehicleFieldStore.load(applicationContext) ?: return
        if (adbSwitchChangePending || vehicleAdbWorkInProgress()) {
            automaticVehicleValidationPending = true
            return
        }
        if (automaticVehicleValidationInProgress) {
            // A request during a run, such as a switch just turned on, runs once this one ends.
            automaticVehicleValidationPending = true
            return
        }
        if (automaticVehicleValidationStarted) return
        automaticVehicleValidationStarted = true
        automaticVehicleValidationInProgress = true
        val generation = ++vehicleValidationGeneration
        Log.i(BYD_VEHICLE_TAG, "automatic vehicle validation starting savedFirmware=${saved.firmwareKey}")
        if (page == "settings" && bydVehicleAdvancedExpanded) render()
        val backend = BydVehicleSettingsBackendProvider.current
        backend.execute("diplay-byd13-auto-validate") {
            val app = applicationContext
            val validation = runCatching {
                var status = backend.check(app, mayAsk = false)
                var outcome: BydVehicleProbeOutcome? = null
                var heldCandidate: BydVehicleCapabilities? = null
                var lostFields: Set<BydVehicleField> = emptySet()
                var snapshotChanged = false
                var readable = status.state == BydAdbAccess.State.READY && enabledVehicleDataReadable(saved, status)
                if (status.state == BydAdbAccess.State.READY && !enabledVehicleDataReadable(saved, status)) {
                    Log.w(BYD_VEHICLE_TAG, "saved vehicle fields unreadable; validating once more")
                    try {
                        Thread.sleep(VEHICLE_VALIDATION_RETRY_MILLIS)
                    } catch (_: InterruptedException) {
                        Thread.currentThread().interrupt()
                    }
                    // A cancelled validation reads nothing more alongside the operation that replaced it.
                    if (generation != vehicleValidationGeneration) {
                        return@runCatching VehicleValidationAttempt(
                            status = status,
                            snapshotChanged = true,
                        )
                    }
                    status = backend.check(app, mayAsk = false)
                    readable = status.state == BydAdbAccess.State.READY && enabledVehicleDataReadable(saved, status)
                    if (status.state == BydAdbAccess.State.READY && !readable) {
                        if (generation != vehicleValidationGeneration) {
                            return@runCatching VehicleValidationAttempt(
                                status = status,
                                snapshotChanged = true,
                            )
                        }
                        Log.w(BYD_VEHICLE_TAG, "saved vehicle fields still unreadable; automatic re-probe starting")
                        val candidate = backend.probe(app, persist = false)
                        if (generation != vehicleValidationGeneration) {
                            return@runCatching VehicleValidationAttempt(
                                status = status,
                                snapshotChanged = true,
                            )
                        }
                        outcome = candidate
                        candidate.capabilities?.let { next ->
                            val replacement = synchronized(vehicleOperationLock) {
                                if (generation != vehicleValidationGeneration) null
                                else BydVehicleFieldStore.replaceAutomatically(app, saved, next)
                            } ?: return@runCatching VehicleValidationAttempt(
                                status = status,
                                snapshotChanged = true,
                            )
                            when {
                                replacement.saved -> Unit
                                replacement.snapshotChanged -> {
                                    snapshotChanged = true
                                    outcome = null
                                }
                                else -> {
                                    heldCandidate = next
                                    lostFields = replacement.lostFields
                                    outcome = BydVehicleProbeOutcome(candidate.access)
                                }
                            }
                        }
                    }
                }
                VehicleValidationAttempt(
                    status = status,
                    outcome = outcome,
                    heldCandidate = heldCandidate,
                    lostFields = lostFields,
                    snapshotChanged = snapshotChanged,
                    savedFieldsReadable = readable,
                )
            }
            runOnUiThread {
                val current = generation == vehicleValidationGeneration
                if (current) automaticVehicleValidationInProgress = false
                if (!current || isFinishing || isDestroyed) return@runOnUiThread
                adbCheckFailed = validation.isFailure
                validation.exceptionOrNull()?.let { Log.w(BYD_VEHICLE_TAG, "automatic vehicle validation failed", it) }
                validation.getOrNull()?.let { result ->
                    adbAccessState = result.outcome?.access ?: result.status.state
                    when {
                        result.snapshotChanged -> Unit
                        result.savedFieldsReadable && result.outcome == null -> {
                            // An open offer to replace stays: this check may not have read its lost fields.
                            vehicleProbeOutcome = null
                        }
                        result.lostFields.isNotEmpty() -> {
                            vehicleProbeOutcome = result.outcome
                            pendingVehicleReplacement = result.heldCandidate
                            pendingVehicleReplacementExpected = saved
                            pendingVehicleLostFields = result.lostFields
                        }
                        result.outcome != null -> {
                            vehicleProbeOutcome = result.outcome
                            pendingVehicleReplacement = null
                            pendingVehicleLostFields = emptySet()
                        }
                    }
                    Log.i(
                        BYD_VEHICLE_TAG,
                        "automatic vehicle validation access=${adbAccessState} " +
                            "reprobed=${result.outcome != null} " +
                            "saved=${result.outcome?.capabilities != null && result.lostFields.isEmpty()} " +
                            "lost=${result.lostFields.joinToString()} " +
                            "snapshotChanged=${result.snapshotChanged} " +
                            "error=${result.outcome?.error ?: "none"}",
                    )
                }
                if (page == "settings" && bydVehicleAdvancedExpanded) {
                    render()
                }
                runPendingAutomaticVehicleValidation()
            }
        }
    }

    private fun scheduleAutomaticVehicleValidation() {
        if (!BydOutputSettings.legacyVehicleProbe(this)) {
            automaticVehicleValidationPending = false
            handler.removeCallbacks(automaticVehicleValidation)
            return
        }
        automaticVehicleValidationStarted = false
        automaticVehicleValidationPending = true
        handler.removeCallbacks(automaticVehicleValidation)
        handler.post(automaticVehicleValidation)
    }

    private fun cancelAutomaticVehicleValidationForUserOperation(
        resumeAfter: Boolean,
    ): BydVehicleCapabilities? = synchronized(vehicleOperationLock) {
        handler.removeCallbacks(automaticVehicleValidation)
        automaticVehicleValidationPending = resumeAfter
        if (resumeAfter) automaticVehicleValidationStarted = false
        vehicleValidationGeneration++
        automaticVehicleValidationInProgress = false
        BydVehicleFieldStore.load(applicationContext)
    }

    private fun runPendingAutomaticVehicleValidation() {
        if (!automaticVehicleValidationPending || adbSwitchChangePending ||
            vehicleAdbWorkInProgress() || automaticVehicleValidationInProgress) return
        handler.removeCallbacks(automaticVehicleValidation)
        handler.post(automaticVehicleValidation)
    }

    /** Whether [status] has every reading an enabled switch needs; null [capabilities] is default mode. */
    private fun enabledVehicleDataReadable(
        capabilities: BydVehicleCapabilities?,
        status: BydAdbAccess.Status,
    ): Boolean {
        if (BydOutputSettings.batteryToIphone(this) && capabilities?.batterySupported != false &&
            (status.batteryPercent == null || status.rangeKm == null)) return false
        if (BydOutputSettings.wheelSpeedToIphone(this) && capabilities?.motionSupported != false &&
            (status.speedKmh == null || status.gear == null)) return false
        if (BydOutputSettings.videoWhileParked(this) && capabilities?.gearSupported != false && status.gear == null) return false
        return true
    }

    private fun adbLinkStatusText(state: BydAdbAccess.State): String = when (state) {
        BydAdbAccess.State.READY -> getString(R.string.adb_access_ready)
        BydAdbAccess.State.NOT_APPROVED -> getString(R.string.adb_enabled_not_approved)
        BydAdbAccess.State.ADB_OFF -> getString(R.string.adb_off)
        BydAdbAccess.State.PAIRING_ONLY -> getString(R.string.adb_pairing_only)
    }

    private fun gearLetter(value: Int): String = when (value) {
        1 -> "P"
        2 -> "R"
        3 -> "N"
        else -> "D"
    }

    private fun reconnectForVehicleSetting() {
        if (CarPlayBackgroundSession.hasSession()) connect(AirPlayPersistence.loadWirelessEnabled(this))
    }

    private fun vehicleDataSwitchesOn() = BydOutputSettings.batteryToIphone(this) ||
        BydOutputSettings.wheelSpeedToIphone(this) || BydOutputSettings.videoWhileParked(this)

    private fun hasPreciseLocation() =
        checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED

    // The cluster screen is described at connection time, so a running session reconnects over
    // its current link. The position choices need no call: getString(R.string.apply_and_reconnect) already does it.


    private fun reconnectIfRunning() {
        if (CarPlayBackgroundSession.hasSession()) connect(AirPlayPersistence.loadWirelessEnabled(this))
    }

    // Saved without dropping CarPlay; the reconnect bar lets the driver choose when.
    private fun markReconnectNeeded() {
        CarPlayBackgroundSession.snapshot()?.controller?.let(PendingReconnect::mark)
        refreshReconnectBar()
    }

    private fun refreshReconnectBar() {
        reconnectBar?.visibility =
            if (PendingReconnect.isPending(CarPlayBackgroundSession.snapshot()?.controller)) View.VISIBLE else View.GONE
    }

    private fun reconnectBar(): View = row().apply {
        gravity = Gravity.CENTER_VERTICAL
        background = rounded(RAIL_SELECTED, RAIL_SELECTED_BORDER)
        setPadding(dp(20), dp(10), dp(12), dp(10))
        addView(label(getString(R.string.settings_reconnect_pending), 16, TEXT), LinearLayout.LayoutParams(0, -2, 1f))
        addView(button(getString(R.string.settings_reconnect_now), true) {
            // No clear(): if connect() stops early (hotspot off, a permission prompt), the change is still pending.
            reconnectIfRunning()
        }, LinearLayout.LayoutParams(-2, dp(52)).apply { marginStart = dp(12) })
        reconnectBar = this
        refreshReconnectBar()
    }

    /** The permissions creating a Wi-Fi Direct group needs, for this Android release. */
    private fun wirelessRadioPermissions(): Array<String> =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arrayOf(Manifest.permission.NEARBY_WIFI_DEVICES)
        } else {
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
            )
        }

    private fun wirelessRadioPermissionGranted(): Boolean {
        val required = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Manifest.permission.NEARBY_WIFI_DEVICES
        } else {
            Manifest.permission.ACCESS_FINE_LOCATION
        }
        return checkSelfPermission(required) == PackageManager.PERMISSION_GRANTED
    }

    /** Asks for the radio permissions, then carries on with the connection that asked. */
    private val wirelessRadioPermission =
        registerForActivityResult(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions()) {
            if (wirelessRadioPermissionGranted()) {
                val wanted = pendingWireless
                pendingWireless = false
                if (wanted) connect(true)
            } else {
                pendingWireless = false
                toast(getString(R.string.wireless_needs_nearby_devices))
            }
        }

    private fun onLocationReportingChanged(enabled: Boolean) {
        if (enabled && !hasPreciseLocation()) {
            // Keep the switch off until precise location is actually granted.
            render()
            locationPermission.launch(arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
            ))
            return
        }
        applyLocationReporting(enabled)
    }

    private fun applyLocationReporting(enabled: Boolean) {
        if (AirPlayPersistence.loadLocationReportingEnabled(this) == enabled) return
        AirPlayPersistence.saveLocationReportingEnabled(this, enabled)
        render()
        // Location support is advertised during iAP2 identification, so both enabling and
        // disabling it require a new session. The host also refreshes its location service type.
        if (CarPlayBackgroundSession.hasSession()) connect(AirPlayPersistence.loadWirelessEnabled(this))
        else toast(getString(R.string.saved_for_your_next_connection))
    }

    /**
     * Selects a wireless mode and shows what it offers, without claiming anything was
     * saved. Choosing a mode is not the same as finishing its setup, and a toast saying
     * otherwise makes the driver think the step is done when it has only begun.
     */
    private fun selectWirelessLink(mode: WirelessHotspotMode) {
        AirPlayPersistence.saveWirelessHotspotMode(this, mode)
        render()
    }

    private fun applyWirelessLink(mode: WirelessHotspotMode) {
        startupHotspotCancelled = true
        AirPlayPersistence.saveWirelessHotspotMode(this, mode)
        render()
        toast(getString(R.string.saved_for_your_next_connection))
    }

    private fun textInput(title: String, current: String, secret: Boolean, save: (String) -> Unit) {
        val input = EditText(appDialogContext()).apply {
            setText(current)
            setSingleLine()
            inputType = if (secret) {
                android.text.InputType.TYPE_CLASS_TEXT or android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
            } else {
                android.text.InputType.TYPE_CLASS_TEXT
            }
        }
        appDialogBuilder().setTitle(title).setView(input)
            .setPositiveButton(getString(R.string.save)) { _, _ -> save(input.text.toString().let { if (secret) it else it.trim() }) }
            .setNegativeButton(getString(R.string.cancel), null).show()
    }

    private fun resolutionSettingControl(
        parent: LinearLayout,
        titleId: Int,
        hintId: Int,
        range: IntRange,
        default: Int,
        summaryId: Int,
        load: () -> Int,
        reconnects: Boolean = false,
        save: (Int) -> Unit,
    ) {
        val title = getString(titleId)
        fun summary() = getString(R.string.contrib_audio_home_choice_summary, title, getString(summaryId, load()))
        val control = button(summary(), false) {}
        control.setOnClickListener {
            val fields = column().apply { setPadding(dp(24), dp(8), dp(24), dp(8)) }
            val input = EditText(appDialogContext()).apply {
                setSingleLine()
                inputType = android.text.InputType.TYPE_CLASS_NUMBER
                setText(load().toString())
            }
            fields.addView(input)
            fields.addView(label(getString(hintId), 14, MUTED))
            val dialog = appDialogBuilder().setTitle(title).setView(fields)
                .setPositiveButton(getString(if (reconnects && CarPlayBackgroundSession.hasSession()) R.string.apply_and_reconnect else R.string.save), null)
                .setNegativeButton(getString(R.string.cancel), null)
                .setNeutralButton(getString(R.string.resolution_reset_defaults), null).create()
            dialog.setOnShowListener {
                dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                    val value = input.text.toString().trim().toIntOrNull()
                    if (value == null || value !in range) {
                        input.error = getString(R.string.resolution_number_error, range.first, range.last)
                    } else {
                        val changed = value != load()
                        save(value)
                        control.text = summary()
                        dialog.dismiss()
                        if (changed && reconnects && CarPlayBackgroundSession.hasSession()) {
                            connect(AirPlayPersistence.loadWirelessEnabled(this))
                        }
                    }
                }
                dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener {
                    input.setText(default.toString())
                    input.error = null
                }
            }
            showResolutionSettingsDialog(dialog, fields)
        }
        parent.addView(control, matchButton(0, 60))
        parent.addView(space(12))
    }

    private fun showResolutionSettingsDialog(dialog: AlertDialog, fields: LinearLayout) {
        dialog.show()
        // AlertDialog replaces the custom view's parameters with MATCH_PARENT. Keep numeric
        // content at its natural height, including on vendor dialog layouts with weighted panels.
        fields.layoutParams = fields.layoutParams.apply { height = ViewGroup.LayoutParams.WRAP_CONTENT }
        val decor = dialog.window?.decorView ?: return
        var panel = fields.parent as? ViewGroup
        while (panel != null && panel !== decor) {
            val params = panel.layoutParams
            if (params is LinearLayout.LayoutParams && params.weight > 0f) {
                panel.layoutParams = params.apply {
                    weight = 0f
                    height = ViewGroup.LayoutParams.WRAP_CONTENT
                }
                break
            }
            panel = panel.parent as? ViewGroup
        }
        dialog.window?.let { window ->
            window.setLayout(window.attributes.width, ViewGroup.LayoutParams.WRAP_CONTENT)
        }
        // Run another traversal after the platform has finished its initial button measurement.
        decor.post { if (dialog.isShowing) decor.requestLayout() }
    }

    private fun nightDelaySettingControl(
        parent: LinearLayout,
        titleId: Int,
        hintId: Int,
        range: IntRange,
        default: Int,
        summaryId: Int,
        load: () -> Int,
        reconnects: Boolean = false,
        save: (Int) -> Unit,
    ) {
        val title = getString(titleId)
        fun summary() = getString(R.string.contrib_audio_home_choice_summary, title, getString(summaryId, load()))
        val control = button(summary(), false) {}
        control.setOnClickListener {
            val fields = column().apply { setPadding(dp(24), dp(8), dp(24), dp(8)) }
            val input = EditText(appDialogContext()).apply {
                setSingleLine()
                inputType = android.text.InputType.TYPE_CLASS_NUMBER
                setText(load().toString())
            }
            fields.addView(input)
            fields.addView(label(getString(hintId), 14, MUTED))
            val dialog = appDialogBuilder().setTitle(title).setView(fields)
                .setPositiveButton(getString(if (reconnects && CarPlayBackgroundSession.hasSession()) R.string.apply_and_reconnect else R.string.save), null)
                .setNegativeButton(getString(R.string.cancel), null)
                .setNeutralButton(getString(R.string.ambient_light_reset_defaults), null).create()
            dialog.setOnShowListener {
                dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                    val value = input.text.toString().trim().toIntOrNull()
                    if (value == null || value !in range) {
                        input.error = getString(R.string.custom_number_error, range.first, range.last)
                    } else {
                        val changed = value != load()
                        save(value)
                        control.text = summary()
                        dialog.dismiss()
                        if (changed && reconnects && CarPlayBackgroundSession.hasSession()) {
                            connect(AirPlayPersistence.loadWirelessEnabled(this))
                        }
                    }
                }
                dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener {
                    input.setText(default.toString())
                    input.error = null
                }
            }
            showNightModeSettingsDialog(dialog, fields)
        }
        parent.addView(control, matchButton(0, 60))
        parent.addView(space(12))
    }

    private fun ambientLightThresholdControl(parent: LinearLayout) {
        val title = getString(R.string.ambient_light_threshold_title)
        fun summary(): String = getString(
            R.string.contrib_audio_home_choice_summary,
            title,
            getString(R.string.ambient_light_threshold_summary, AirPlayPersistence.loadAmbientLightThreshold(this).lux),
        )

        val control = button(summary(), false) {}
        control.setOnClickListener {
            val fields = column().apply { setPadding(dp(24), dp(8), dp(24), dp(8)) }
            val input = EditText(appDialogContext()).apply {
                setSingleLine()
                inputType = android.text.InputType.TYPE_CLASS_NUMBER
                setText(AirPlayPersistence.loadAmbientLightThreshold(this@CarlinkActivity).lux.toString())
            }
            fields.addView(input)
            fields.addView(label(getString(R.string.ambient_light_threshold_hint), 14, MUTED))
            val dialog = appDialogBuilder()
                .setTitle(title)
                .setView(fields)
                .setPositiveButton(getString(R.string.save), null)
                .setNegativeButton(getString(R.string.cancel), null)
                .setNeutralButton(getString(R.string.ambient_light_reset_defaults), null)
                .create()

            dialog.setOnShowListener {
                dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener saveThreshold@{
                    val lux = input.text.toString().trim().toIntOrNull()
                    if (lux == null || !AmbientLightThreshold.isValid(lux)) {
                        input.error = getString(R.string.ambient_light_threshold_error)
                        return@saveThreshold
                    }
                    AirPlayPersistence.saveAmbientLightThreshold(this, AmbientLightThreshold(lux))
                    control.text = summary()
                    dialog.dismiss()
                }
                dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener {
                    input.setText(AmbientLightThreshold.DEFAULT_LUX.toString())
                    input.error = null
                }
            }
            showNightModeSettingsDialog(dialog, fields)
        }
        parent.addView(control, matchButton(0, 60))
        parent.addView(space(12))
    }

    private fun showNightModeSettingsDialog(dialog: AlertDialog, fields: LinearLayout) {
        dialog.show()
        // AlertDialog replaces the custom view's parameters with MATCH_PARENT. Keep numeric
        // content at its natural height, including on vendor dialog layouts with weighted panels.
        fields.layoutParams = fields.layoutParams.apply { height = ViewGroup.LayoutParams.WRAP_CONTENT }
        val decor = dialog.window?.decorView ?: return
        var panel = fields.parent as? ViewGroup
        while (panel != null && panel !== decor) {
            val params = panel.layoutParams
            if (params is LinearLayout.LayoutParams && params.weight > 0f) {
                panel.layoutParams = params.apply {
                    weight = 0f
                    height = ViewGroup.LayoutParams.WRAP_CONTENT
                }
                break
            }
            panel = panel.parent as? ViewGroup
        }
        dialog.window?.let { window ->
            window.setLayout(window.attributes.width, ViewGroup.LayoutParams.WRAP_CONTENT)
        }
        // Run another traversal after the platform has finished its initial button measurement.
        decor.post { if (dialog.isShowing) decor.requestLayout() }
    }

    /** Where CarPlay puts its dock; between the two fixed edges it moves at once, otherwise on reconnect. */
    private fun carPlayDockControl(card: LinearLayout) {
        val docks = CarPlayDock.entries
        choice(card, getString(R.string.carplay_dock), listOf(
            getString(R.string.carplay_dock_automatic),
            getString(R.string.carplay_dock_driver_side),
            getString(R.string.carplay_dock_bottom),
        ), docks.indexOf(CarPlayDock.load(this)), reconnects = false) {
            val from = CarPlayDock.load(this)
            val to = docks[it]
            CarPlayDock.save(this, to)
            val session = CarPlayBackgroundSession.snapshot()
            val areas = session?.display?.viewAreas
            val target = to.edge?.let { areas?.withDock(it) }
            if (CarPlayDock.movesLive(from, to) && areas != null && target != null) {
                if (session.controller.showViewArea(target)) areas.use(target)
            } else {
                markReconnectNeeded()
            }
        }
        card.addView(label(getString(R.string.carplay_dock_hint), 14, MUTED).apply { setPadding(0, 0, 0, dp(18)) })
    }

    private fun carButtonControls(parent: LinearLayout) {
        val custom = AirPlayPersistence.loadCustomAirPlayIconFile(this)?.let { BitmapFactory.decodeFile(it.absolutePath) }
        val preview = row().apply { gravity = Gravity.CENTER_VERTICAL }
        preview.addView(ImageView(this).apply {
            setImageBitmap(custom ?: BitmapFactory.decodeResource(resources, R.raw.ic_car_home))
            scaleType = ImageView.ScaleType.CENTER_CROP
            background = rounded(SURFACE, BORDER)
            clipToOutline = true
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }, LinearLayout.LayoutParams(dp(72), dp(72)).apply { marginEnd = dp(16) })
        val text = column()
        text.addView(label(getString(R.string.car_button_icon), 18, TEXT, true))
        text.addView(label(getString(if (custom != null) R.string.car_button_icon_custom else R.string.default_icon), 14, MUTED).apply { setPadding(0, dp(6), 0, 0) })
        preview.addView(text, LinearLayout.LayoutParams(0, -2, 1f))
        parent.addView(preview)
        parent.addView(button(getString(R.string.choose_image), false) {
            launchCarButtonImagePicker(
                openDocument = { iconDocumentPicker.launch(arrayOf("image/*")) },
                getContent = { iconPicker.launch("image/*") },
                documentPickerIsSystem = documentPickerIsSystem(),
            ).onFailure { toast(getString(R.string.this_head_unit_has_no_image_picker)) }
        }, matchButton(16, 60))
        if (custom != null) parent.addView(button(getString(R.string.default_icon), false) {
            AirPlayPersistence.clearCustomAirPlayIcon(this)
            refreshCarButton()
            carButtonSaved()
        }, matchButton(10, 60))
        val name = AirPlayPersistence.loadOemLabel(this)
        parent.addView(button("${getString(R.string.car_button_name)} · $name", false) {
            textInput(getString(R.string.car_button_name), name, secret = false) {
                AirPlayPersistence.saveOemLabel(this, it)
                refreshCarButton()
                carButtonSaved()
            }
        }, matchButton(10, 60))
        parent.addView(label(getString(R.string.car_button_description), 14, MUTED).apply { setPadding(0, dp(12), 0, 0) })
    }

    private fun carButtonSaved() {
        markReconnectNeeded()
        if (CarPlayBackgroundSession.hasSession()) toast(getString(R.string.car_button_saved_next_connection))
    }

    // Rebuilds only this card: render() would scroll the page back to the top.
    private fun refreshCarButton() {
        val card = carButtonCard ?: return
        card.removeViews(1, card.childCount - 1)
        carButtonControls(card)
        normalizeSpacing(card)
    }

    private fun carPlaySizeControl(parent: LinearLayout) {
        val sizes = net.easyconn.gwmec.airplay.CarPlaySize.entries
        val current = net.easyconn.gwmec.airplay.CarPlaySize.fromWidthMillimeters(AirPlayPersistence.loadWidthPhysicalMm(this))
        choice(parent, getString(R.string.carplay_size), sizes.map { it.localizedLabel(this) }, sizes.indexOf(current)) {
            AirPlayPersistence.saveWidthPhysicalMm(this, sizes[it].widthMillimeters)
        }
        parent.addView(label(getString(R.string.changes_the_size_of_carplay_icons_and_text_applying_a_size), 14, MUTED).apply {
            setPadding(0, 0, 0, dp(18))
        })
    }

    private fun scheduleTimeControl(parent: LinearLayout, start: Boolean) {
        val title = getString(if (start) R.string.carplay_night_start else R.string.carplay_night_end)
        fun labelFor(minute: Int) = "$title · ${String.format(Locale.getDefault(), "%02d:%02d", minute / 60, minute % 60)}"
        val initial = AirPlayPersistence.loadCarPlayNightSchedule(this)
        val control = button(labelFor(if (start) initial.startMinute else initial.endMinute), false) {}
        control.setOnClickListener {
            val current = AirPlayPersistence.loadCarPlayNightSchedule(this)
            val selected = if (start) current.startMinute else current.endMinute
            TimePickerDialog(this, appDialogTheme(), { _, hour, minute ->
                val updatedMinute = hour * 60 + minute
                val other = if (start) current.endMinute else current.startMinute
                if (updatedMinute == other) {
                    toast(getString(R.string.carplay_night_schedule_same_time))
                } else {
                    val updated = if (start) current.copy(startMinute = updatedMinute)
                        else current.copy(endMinute = updatedMinute)
                    AirPlayPersistence.saveCarPlayNightSchedule(this, updated)
                    control.text = labelFor(updatedMinute)
                    handler.post(::checkForAppearanceChange)
                }
            }, selected / 60, selected % 60, true).show()
        }
        parent.addView(control, matchButton(0, 60))
        parent.addView(space(12))
    }

    private fun connect(wireless: Boolean) {
        startupHotspotCancelled = true
        // The driver is asking to connect again: stop holding back the Bluetooth wake-up.
        getSharedPreferences("diplay_phone_wake", MODE_PRIVATE).edit()
            .remove(keyManualStop).apply()
        if (wireless && pendingCarHotspotSetup) { toast(getString(R.string.save_your_hotspot_details_in_connection_setup_first)); page = "connection"; render(); return }
        if (setupError != null) { toast(setupError!!); return }
        if (wireless && AirPlayPersistence.loadWirelessHotspotMode(this) == WirelessHotspotMode.MANUAL &&
            hotspotError(storedSsid(), storedPassword()) != null) {
            pendingCarHotspotSetup = true
            page = "connection"
            render()
            toast(getString(R.string.save_the_name_and_password_from_the_car_s_hotspot_settings))
            return
        }
        if (wireless && carHotspotOff()) { carHotspotOffDialog(); return }
        // Creating a Wi-Fi Direct group needs the nearby-devices permission on Android 13+
        // and precise location before it. Without asking here, a device that has never been
        // asked fails inside the stack with a message about permissions the driver never saw
        // a prompt for — which reads as "Wi-Fi Direct cannot be created" and, on a tablet,
        // leaves only the same-LAN path working.
        if (wireless && !wirelessRadioPermissionGranted()) {
            pendingWireless = true
            wirelessRadioPermission.launch(wirelessRadioPermissions())
            return
        }
        if (wireless && CarlinkPreferences.phoneAddress(this) == null) {
            pendingWireless = true; choosePhone(); return
        }
        val preferences = getSharedPreferences("diplay", MODE_PRIVATE)
        if (Build.VERSION.SDK_INT >= 33 && checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED && !preferences.getBoolean("notification_asked", false)) {
            preferences.edit().putBoolean("notification_asked", true).apply()
            notificationTransport = wireless
            notificationPermission.launch(Manifest.permission.POST_NOTIFICATIONS)
            return
        }
        val open = {
            AirPlayPersistence.saveWirelessEnabled(this, wireless)
            armProjectionHandover()
            phoneAbsentHint = null
            startBackgroundConnect()
        }
        if (CarPlayBackgroundSession.hasSession()) CarPlayBackgroundSession.stop { runOnUiThread { open() } }
        else open()
    }

    private fun watchForSession() {
        CarPlayBackgroundSession.onSessionActive = {
            handler.post {
                if (shouldHandToProjection()) {
                    autoEnterUsedThisRun = true
                    setProjectionHandled(true)
                    openProjection()
                }
            }
        }
        CarPlayBackgroundSession.onSessionFailed = { _ ->
            handler.post {
                phoneAbsentHint = getString(R.string.iphone_not_in_the_car)
                refreshHomeStatus()
            }
        }
    }

    private fun startBackgroundConnect() {
        phoneAbsentHint = null
        watchForSession()
        startActivity(Intent(this, CarPlayHostActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS or
                Intent.FLAG_ACTIVITY_NO_ANIMATION or
                Intent.FLAG_ACTIVITY_NO_USER_ACTION)
            .putExtra("background_connect", true))
    }

    /**
     * Opens the CarPlay picture.
     */
    private fun openProjection() {
        OwnScreenStart.start(this, Intent(this, CarPlayHostActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
    }

    private fun choosePhone() {
        if (Build.VERSION.SDK_INT >= 31 && checkSelfPermission(Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
            bluetoothPermission.launch(Manifest.permission.BLUETOOTH_CONNECT); return
        }
        val adapter = getSystemService(BluetoothManager::class.java)?.adapter
        if (adapter == null || !adapter.isEnabled) {
            appDialogBuilder().setTitle(getString(R.string.turn_on_bluetooth))
                .setMessage(getString(R.string.enable_the_car_s_bluetooth_and_pair_your_iphone_first))
                .setPositiveButton(getString(R.string.open_bluetooth)) { _, _ -> openSystem(Intent(Settings.ACTION_BLUETOOTH_SETTINGS)) }
                .setNegativeButton(getString(R.string.later), null).show(); return
        }
        val devices = runCatching { adapter.bondedDevices.sortedBy { it.name ?: "" } }.getOrDefault(emptyList())
        if (devices.isEmpty()) {
            appDialogBuilder().setTitle(getString(R.string.pair_your_iphone))
                .setMessage(getString(R.string.on_your_iphone_open_settings_bluetooth_and_pair_with_the_c))
                .setPositiveButton(getString(R.string.open_bluetooth)) { _, _ -> openSystem(Intent(Settings.ACTION_BLUETOOTH_SETTINGS)) }
                .setNegativeButton(getString(R.string.got_it), null).show(); return
        }
        appDialogBuilder().setTitle(getString(R.string.choose_your_iphone))
            .setItems(devices.map { device ->
                val name = device.name ?: getString(R.string.paired_device)
                if (devices.count { it.name == device.name } > 1) "$name · ${device.address.takeLast(5)}" else name
            }.toTypedArray()) { _, index ->
                val device = devices[index]
                CarlinkPreferences.savePhone(this, device.address, device.name ?: "iPhone")
                val start = pendingWireless; pendingWireless = false
                render()
                if (start) connect(true)
            }.setNeutralButton(getString(R.string.pair_another)) { _, _ -> openSystem(Intent(Settings.ACTION_BLUETOOTH_SETTINGS)) }
            .setNegativeButton(getString(R.string.cancel)) { _, _ -> pendingWireless = false }.show()
    }

    private fun wirelessHelp() {
        appDialogBuilder().setTitle(getString(R.string.wireless_connection_help))
            .setMessage(getString(R.string.pair_your_iphone_with_the_car_s_bluetooth_keep_wi_fi_on_an))
            .setPositiveButton(getString(R.string.got_it), null)
            .setNeutralButton(getString(R.string.reset_carplay_wi_fi)) { _, _ ->
                confirmWirelessReset()
            }.show()
    }

    private fun handleWirelessRecovery() {
        if (page != "wireless-recovery") return
        page = "home"; render()
        confirmWirelessReset()
    }

    private fun confirmWirelessReset() {
        appDialogBuilder().setTitle(getString(R.string.reset_carplay_wi_fi_2))
            .setMessage(getString(R.string.this_ends_the_existing_wi_fi_direct_connection_including_o))
            .setPositiveButton(getString(R.string.reset_and_connect)) { _, _ ->
                CarPlayBackgroundSession.stop { runOnUiThread { resetWirelessGroup() } }
            }.setNegativeButton(getString(R.string.cancel), null).show()
    }

    private fun resetWirelessGroup() {
        val manager = getSystemService(android.net.wifi.p2p.WifiP2pManager::class.java)
        if (manager == null) { toast(getString(R.string.this_head_unit_does_not_support_wi_fi_direct)); return }
        val channel = manager.initialize(this, mainLooper, null)
        try {
            manager.requestGroupInfo(channel) { group ->
                if (group == null) { channel.closeCompat(); connect(true); return@requestGroupInfo }
                manager.removeGroup(channel, object : android.net.wifi.p2p.WifiP2pManager.ActionListener {
                    override fun onSuccess() {
                        val deadline = android.os.SystemClock.elapsedRealtime() + 4000
                        fun waitUntilRemoved() {
                            manager.requestGroupInfo(channel) { remaining ->
                                when {
                                    remaining == null -> { channel.closeCompat(); if (!isFinishing && !isDestroyed) connect(true) }
                                    android.os.SystemClock.elapsedRealtime() >= deadline -> {
                                        channel.closeCompat(); toast(getString(R.string.wi_fi_direct_is_still_busy_close_the_other_projection_app))
                                    }
                                    else -> handler.postDelayed({ waitUntilRemoved() }, 200)
                                }
                            }
                        }
                        waitUntilRemoved()
                    }
                    override fun onFailure(reason: Int) { channel.closeCompat(); toast(getString(R.string.could_not_reset_wi_fi_direct_close_the_other_projection_ap)) }
                })
            }
        } catch (_: SecurityException) {
            channel.closeCompat(); permissionHelp(getString(R.string.wireless_permissions), getString(R.string.allow_nearby_devices_and_on_older_android_versions_locatio))
        }
    }

    private fun refreshStatus() {
        val running = CarPlayBackgroundSession.hasSession()
        // The home owns the whole wait, so its controls change with the link's state: a
        // transition re-renders the page rather than patching labels into the wrong set.
        val state = homeState()
        if (state != lastHomeState && page == "home") {
            lastHomeState = state
            lastRunning = running
            // Refill the home's own box in place; only rebuild the page if it cannot.
            if (!refreshHomeStatus()) render()
            return
        }
        lastHomeState = state
        status?.text = when {
            setupError != null -> getString(R.string.setup_needs_attention)
            CarPlayBackgroundSession.active -> getString(R.string.carplay_connected)
            // A stop holds the session for a moment; that is the link going away, not coming up.
            disconnecting -> getString(R.string.disconnecting)
            running -> getString(R.string.connecting_to_your_iphone)
            CarlinkPreferences.phoneAddress(this) != null -> "${getString(R.string.status_ready_for_prefix)}${CarlinkPreferences.phoneName(this)}"
            else -> getString(R.string.ready_when_you_are)
        }
        if (lastRunning != running) {
            connectButton?.text = if (running) getString(R.string.open_carplay) else getString(R.string.connect_phone)
            disconnectButton?.visibility = if (running) View.VISIBLE else View.GONE
            disconnectButton?.isEnabled = true
            lastRunning = running
        }
        connectButton?.isEnabled = setupError == null
        refreshReconnectBar()
        refreshReadiness()
    }

    private fun reportFileName() = "Carlink-${SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.US).format(Date())}.txt"

    private fun saveReportToDownloads() {
        if (exportInProgress) return
        if (DiagnosticExportStore.needsStoragePermission(this)) {
            runCatching { reportStoragePermission.launch(Manifest.permission.WRITE_EXTERNAL_STORAGE) }
                .onFailure { exportDiagnostics() }
        } else exportDiagnostics()
    }

    private fun chooseReportDestination() {
        // Some head units omit or disable DocumentsUI. Launch itself can throw, before
        // the result callback and the background writer's exception handler ever run.
        if (exportInProgress) return
        runCatching { export.launch(reportFileName()) }.onFailure { exportDiagnostics() }
    }

    private fun exportDiagnostics(uri: Uri? = null) {
        if (exportInProgress) return
        exportInProgress = true
        exportButton?.apply { isEnabled = false; text = getString(R.string.saving_report) }
        val appContext = applicationContext
        val fileName = reportFileName()
        Thread({
            val result = runCatching {
                val report = buildString {
                    appendLine("Carlink ${version()} · private beta diagnostic report")
                    appendLine("Android ${Build.VERSION.RELEASE} / API ${Build.VERSION.SDK_INT}")
                    appendLine("Head unit: ${Build.MANUFACTURER} ${Build.MODEL}")
                    appendLine("Connection: ${if (AirPlayPersistence.loadWirelessEnabled(appContext)) "wireless" else "USB"}")
                    AirPlayPersistence.loadUsbChargingCurrent(appContext).let {
                        appendLine("USB charging offer: ${it.key} (${it.milliAmps} mA)")
                    }
                    appendLine("Authentication: local experimental beta identity; no remote fallback")
                    appendLine("CarPlay setup: ${if (setupError == null) "ready" else "authentication unavailable"}")
                    appendLine("Saved video preference (may differ from active session): ${if (AirPlayPersistence.loadHevcEnabled(appContext)) "HEVC" else "H.264"}; ${AirPlayPersistence.loadFps(appContext)} fps")
                    appendLine("CarPlay size: ${net.easyconn.gwmec.airplay.CarPlaySize.fromWidthMillimeters(AirPlayPersistence.loadWidthPhysicalMm(appContext)).label}")
                    appendLine("Saved resolution preference (may differ from active session): ${AirPlayPersistence.loadDisplayScalePercent(appContext)}%")
                    appendLine("Session: ${if (CarPlayBackgroundSession.active) "active" else if (CarPlayBackgroundSession.hasSession()) "connecting" else "stopped"}")
                    appendLine(PhoneWakeDiagnostics.report(appContext))
                    appendLine(LastCrashReport.report(appContext))
                    appendLine(CrashRecord.report(appContext))
                    WheelKeyLog.report(WheelKeyService.connected()).forEach { appendLine(it) }
                    appendLine("Head-unit board: ${Build.BOARD}; hardware: ${Build.HARDWARE}; build: ${Build.DISPLAY}")
                    appendLine()
                    appendLine(BluetoothDiagnosticSnapshot.report(appContext))
                    appendLine()
                    appendLine("--- Current cluster display diagnostics (even when disabled) ---")
                    appendLine(ClusterMapPresentation.diagnosticReport(appContext))
                    appendLine()
                    appendLine("--- ADB cluster activity routing ---")
                    appendLine("adbClusterActivityEnabled=${AirPlayPersistence.loadAdbClusterEnabled(appContext)}")
                    appendLine("clusterActivityMainTask=${ClusterActivityOutput.mainTaskId} surfaceValid=${ClusterActivityOutput.surface?.isValid}")
                    AdbClusterRouter.report(appContext).lineSequence().forEach { line ->
                        DiagnosticRedactor.redact(line)?.let { appendLine(it) }
                    }
                    appendLine()
                    appendLine("--- Standalone HUD compatibility ---")
                    appendLine(BydOutputSettings.standaloneHudDiagnosticReport(appContext))
                    appendLine()
                    appendLine("--- BYD vehicle-data probe ---")
                    appendLine(
                        "mode=${if (BydOutputSettings.legacyVehicleProbe(appContext)) "legacy-probe" else "default"} " +
                            "switches location=${AirPlayPersistence.loadLocationReportingEnabled(appContext)} " +
                            "battery=${BydOutputSettings.batteryToIphone(appContext)} " +
                            "wheelSpeed=${BydOutputSettings.wheelSpeedToIphone(appContext)} " +
                            "parkedVideo=${BydOutputSettings.videoWhileParked(appContext)}",
                    )
                    val bydCapabilities = BydVehicleFieldStore.load(appContext)
                    if (bydCapabilities == null) {
                        appendLine("no saved successful probe")
                    } else {
                        appendLine(
                            "catalog=${bydCapabilities.catalogAvailable} detectedAt=${bydCapabilities.detectedAtMillis} " +
                                "savedFirmware=${bydCapabilities.firmwareKey} " +
                                "currentFirmware=${BydVehicleFieldStore.firmwareKey()}",
                        )
                        for (field in BydVehicleField.entries) {
                            val probe = bydCapabilities.result(field)
                            appendLine("${field.name}: supported=${probe.supported} " +
                                (probe.address?.let { "tx=${it.transaction} dev=${it.device} fid=${it.fid} source=${it.source}" }
                                    ?: "address=none"))
                        }
                    }
                    appendLine()
                    appendLine("--- Last display negotiation (timestamps distinguish it from current settings) ---")
                    appendLine(DisplayDiagnosticSnapshot.report(appContext))
                    appendLine()
                    appendLine("--- Last received boot and app-launch result ---")
                    appendLine(StartupDiagnosticSnapshot.report(appContext))
                    appendLine("Startup settings: openAfterBoot=${AirPlayPersistence.loadAutoStartOnBoot(appContext)} " +
                        "connectWhenOpened=${CarlinkPreferences.autoConnect(appContext)}")
                    appendLine()
                    appendLine(UpdateAvailability.report(appContext, System.currentTimeMillis()))
                    appendLine()
                    appendLine("--- Recent own-app process exits (Android 11+) ---")
                    appendLine(ProcessExitDiagnostics.report(appContext))
                    appendLine()
                    for (name in SessionLogFile.REPORT_NAMES) {
                        val file = File(appContext.filesDir, "logs/$name")
                        if (file.isFile) {
                            appendLine("--- $name ---")
                            file.useLines { lines -> lines.forEach { line -> DiagnosticRedactor.redact(line)?.let { appendLine(it) } } }
                        }
                    }
                }
                val savedReport = if (uri != null) {
                    DiagnosticExportStore.write(appContext.contentResolver, uri, report)
                    DiagnosticExportStore.SavedReport(uri)
                } else DiagnosticExportStore.saveWithoutPicker(appContext, fileName, report)
                savedReport to report
            }
            runOnUiThread {
                exportInProgress = false
                if (isFinishing || isDestroyed) return@runOnUiThread
                exportButton?.apply { isEnabled = true; text = getString(R.string.save_diagnostic_report) }
                if (result.isSuccess) {
                    val (savedReport, report) = result.getOrThrow()
                    appDialogBuilder().setTitle(getString(R.string.diagnostic_report_saved))
                        .setMessage(when {
                            savedReport.savedInApp -> getString(R.string.diagnostic_report_saved_in_app)
                            savedReport.savedPath != null -> getString(R.string.diagnostic_report_saved_to_path, savedReport.savedPath)
                            uri == null -> "Downloads/Carlink/$fileName"
                            else -> getString(R.string.your_report_was_saved_to_the_selected_location)
                        })
                        .setPositiveButton(getString(R.string.view_diagnostic_report)) { _, _ -> showDiagnosticReport(report) }
                        .setNegativeButton(getString(R.string.done), null)
                        .setNeutralButton(getString(R.string.share)) { _, _ ->
                            runCatching {
                                startActivity(Intent.createChooser(Intent(Intent.ACTION_SEND).apply {
                                    type = "text/plain"; putExtra(Intent.EXTRA_STREAM, savedReport.uri)
                                    clipData = android.content.ClipData.newRawUri(getString(R.string.report_clip_label), savedReport.uri)
                                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                                }, getString(R.string.share_diagnostic_report)))
                            }.onFailure { showDiagnosticReport(report) }
                        }.show()
                } else {
                    appDialogBuilder().setTitle(getString(R.string.could_not_save_the_report))
                        .setMessage(getString(R.string.check_that_storage_is_available_or_choose_another_save_loc))
                        .setPositiveButton(getString(R.string.choose_location)) { _, _ -> chooseReportDestination() }
                        .setNegativeButton(getString(R.string.close), null).show()
                }
            }
        }, "diplay-export").start()
    }

    private fun showDiagnosticReport(report: String) {
        val body = column().apply { setPadding(dp(24), dp(12), dp(24), dp(12)) }
        body.addView(label(getString(R.string.diagnostic_report_copy_hint), 14, MUTED))
        body.addView(label(report, 13, TEXT).apply {
            typeface = Typeface.MONOSPACE
            setTextIsSelectable(true)
        })
        appDialogBuilder().setTitle(getString(R.string.view_diagnostic_report))
            .setView(ScrollView(appDialogContext()).apply { addView(body) })
            .setPositiveButton(getString(R.string.close), null).show()
    }
    private fun permissionHelp(title: String, body: String) {
        appDialogBuilder().setTitle(title).setMessage(body).setPositiveButton(getString(R.string.app_settings)) { _, _ ->
            openSystem(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:$packageName")))
        }.setNegativeButton(getString(R.string.later), null).show()
    }
    private fun openSystem(intent: Intent) { runCatching { startActivity(intent) }.onFailure { toast(getString(R.string.open_this_setting_from_your_car_s_settings_app)) } }
    private fun toast(message: String) { Toast.makeText(this, message, Toast.LENGTH_LONG).show() }

    private fun playTestTone(streamType: Int) {
        toneStop?.let { handler.removeCallbacks(it) }
        toneStop = null
        testToneTrack?.let { runCatching { it.stop(); it.release() } }
        testToneTrack = null
        var candidate: AudioTrack? = null
        val track = try {
            val pcm = assets.open("navigation_test.pcm").use { it.readBytes() }
            AudioTrack(streamType, 44100, AudioFormat.CHANNEL_OUT_MONO,
                AudioFormat.ENCODING_PCM_16BIT, pcm.size, AudioTrack.MODE_STREAM).also {
                candidate = it
                check(it.state == AudioTrack.STATE_INITIALIZED)
                check(it.write(pcm, 0, pcm.size) == pcm.size)
                it.play()
            }
        } catch (error: Exception) {
            val state = candidate?.state ?: AudioTrack.STATE_UNINITIALIZED
            candidate?.let { runCatching { it.release() } }
            Log.w("Carlink", "playTestTone streamType=$streamType unavailable", error)
            toast(getString(R.string.audio_stream_unavailable, streamType, state))
            return
        }
        Log.i("Carlink", "playTestTone streamType=$streamType state=${track.state} playState=${track.playState}")
        testToneTrack = track
        val stop = Runnable {
            track.stop()
            track.release()
            if (testToneTrack === track) testToneTrack = null
            toneStop = null
        }
        toneStop = stop
        handler.postDelayed(stop, 4500)
    }

    private val channelButtons = mutableListOf<Button>()

    private fun paintChannel(index: Int, selected: Boolean) {
        val target = channelButtons.getOrNull(index) ?: return
        target.isSelected = selected
        target.setTextColor(if (selected) ON_ACCENT else TEXT)
        target.background = android.graphics.drawable.RippleDrawable(
            ColorStateList.valueOf(RIPPLE),
            buttonShape(if (selected) ACCENT else SURFACE, if (selected) ACCENT else BORDER, target.height),
            null
        )
    }

    private fun version() = packageManager.getPackageInfo(packageName, 0).versionName ?: "0.1.0-beta.1"
    private fun languageSettings(content: LinearLayout) {
        filteredSection(content, SettingsSection.LANGUAGE,
            getString(R.string.language_section_title), R.drawable.ic_dp_language) { card ->
            card.addView(label(getString(R.string.language_hint), 14, MUTED))
            val current = AppLocale.preference(this)
            val languageButton = button("${getString(R.string.language_app_language)} · ${AppLocale.displayName(this, current)}", false) { }
            languageButton.setOnClickListener { AppLocale.showPicker(this) }
            card.addView(languageButton, matchButton(12, 60))
        }
    }

    private fun section(parent: LinearLayout, title: String, icon: Int? = null, build: (LinearLayout) -> Unit) {
        searchIndexSink?.add(title)
        // A divider belongs between groups, not under each one: drawing it under every
        // group left the last one with a line that separates it from nothing.
        if (page == "settings" && parent.childCount > 0) {
            parent.addView(View(this).apply {
                background = GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, intArrayOf(
                    (Color.WHITE and 0x00FFFFFF) or 0x00000000,
                    (Color.WHITE and 0x00FFFFFF) or 0x30000000,
                    (Color.WHITE and 0x00FFFFFF) or 0x00000000,
                ))
            }, LinearLayout.LayoutParams(-1, dp(1)).apply {
                marginStart = dp(24); marginEnd = dp(24)
                bottomMargin = dp(SETTINGS_BLOCK_GAP_DP)
            })
        }
        val card = card()
        val heading = row().apply { gravity = Gravity.CENTER_VERTICAL; setPadding(0, 0, 0, dp(16)) }
        if (icon != null) heading.addView(ImageView(this).apply {
            setImageResource(icon); imageTintList = ColorStateList.valueOf(ACCENT)
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }, LinearLayout.LayoutParams(dp(28), dp(28)).apply { marginEnd = dp(12) })
        heading.addView(label(title, 22, TEXT, true,
            centreGlyphs = icon != null && usesChineseGlyphAlignment(resources.configuration.locales[0].language, title)),
            LinearLayout.LayoutParams(0, -2, 1f))
        card.addView(heading)
        build(card)
        if (page == "settings") normalizeSpacing(card)
        parent.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(SETTINGS_BLOCK_GAP_DP) })
    }
    private fun audioFocusControls(parent: LinearLayout) {
        val enabled = AirPlayPersistence.loadAudioFocusEnabled(this)
        val dependent = column().apply { visibility = if (enabled) View.VISIBLE else View.GONE }
        toggle(parent, getString(R.string.contrib_audio_home_toggle_audio_focus),
            getString(R.string.contrib_audio_home_toggle_audio_focus_desc), enabled) {
            AirPlayPersistence.saveAudioFocusEnabled(this, it)
            markReconnectNeeded()
            dependent.visibility = if (it) View.VISIBLE else View.GONE
        }
        toggle(dependent, getString(R.string.audio_focus_auto_yield), getString(R.string.audio_focus_auto_yield_desc),
            AirPlayPersistence.loadAudioFocusAutoYield(this)) {
            AirPlayPersistence.saveAudioFocusAutoYield(this, it)
            markReconnectNeeded()
        }
        parent.addView(dependent)
    }


    private fun filteredSection(
        parent: LinearLayout,
        key: SettingsSection,
        title: String,
        icon: Int? = null,
        build: (LinearLayout) -> Unit,
    ) {
        if (settingsSectionFilter?.contains(key) == false) return
        section(parent, title, icon, build)
    }

    private fun toggle(parent: LinearLayout, title: String, description: String, value: Boolean, enabled: Boolean = true, save: (Boolean) -> Unit): Switch {
        searchIndexSink?.add(title)
        val result = SettingsWidgets.createSwitchRow(
            context = this,
            label = title,
            description = description,
            checked = value,
            theme = SettingsTheme.card(palette),
            contentDescription = title,
            enabled = enabled,
            onChanged = save,
        )
        parent.addView(result.rowView)
        return result.switch
    }
    private fun ambientConfigurationLabel(value: AmbientMusicSettings.Values): String {
        val mode = if (!value.music) getString(R.string.settings_ambient_static) else when (value.colorMode) {
            AmbientColorMode.ENERGY -> getString(R.string.settings_ambient_energy)
            AmbientColorMode.BEAT -> getString(R.string.settings_ambient_beat)
            AmbientColorMode.TEMPO -> getString(R.string.settings_ambient_tempo)
            AmbientColorMode.BASS -> getString(R.string.settings_ambient_bass)
            AmbientColorMode.SMART -> getString(R.string.settings_ambient_smart)
        }
        val speed = when (value.speed) { AmbientColorSpeed.SLOW -> getString(R.string.settings_ambient_slow); AmbientColorSpeed.STANDARD -> getString(R.string.settings_ambient_standard); AmbientColorSpeed.FAST -> getString(R.string.settings_ambient_fast) }
        return getString(R.string.settings_ambient_configuration) + " · " + getString(R.string.settings_ambient_summary, getString(if (value.enabled) R.string.settings_ambient_enabled else R.string.settings_ambient_disabled), mode, speed, value.selectedColors.size, value.brightness)
    }

    private fun showAmbientConfiguration() {
        var draft = AmbientMusicSettings.load(this)
        val body = column().apply { setPadding(dp(24), dp(12), dp(24), dp(12)) }
        body.addView(label(getString(R.string.settings_ambient_parked_notice), 14, MUTED))
        toggle(body, getString(R.string.settings_ambient_enable), getString(R.string.settings_ambient_enable_description), draft.enabled) {
            draft = draft.copy(enabled = it)
        }
        toggle(body, getString(R.string.settings_ambient_music), getString(R.string.settings_ambient_music_description), draft.music) {
            draft = draft.copy(music = it)
        }
        toggle(body, getString(R.string.settings_ambient_album), getString(R.string.settings_ambient_album_description), draft.colorSource == AmbientColorSource.ALBUM) {
            draft = draft.copy(colorSource = if (it) AmbientColorSource.ALBUM else AmbientColorSource.SELECTED)
        }
        choice(body, getString(R.string.settings_ambient_color_mode), listOf(getString(R.string.settings_ambient_energy), getString(R.string.settings_ambient_beat), getString(R.string.settings_ambient_tempo), getString(R.string.settings_ambient_bass), getString(R.string.settings_ambient_smart)), draft.colorMode.ordinal, reconnects = false) {
            draft = draft.copy(colorMode = AmbientColorMode.entries[it])
        }
        choice(body, getString(R.string.settings_ambient_speed), listOf(getString(R.string.settings_ambient_slow), getString(R.string.settings_ambient_standard), getString(R.string.settings_ambient_fast)), draft.speed.ordinal, reconnects = false) {
            draft = draft.copy(speed = AmbientColorSpeed.entries[it])
        }
        val paletteButton = button(getString(R.string.settings_ambient_palette_summary, draft.selectedColors.size), false) {}
        paletteButton.setOnClickListener {
            val checked = BooleanArray(31) { it + 1 in draft.selectedColors }
            val paletteDialog = AlertDialog.Builder(this).setTitle(getString(R.string.settings_ambient_palette))
                .setMultiChoiceItems((1..31).map { it.toString() }.toTypedArray(), checked) { _, index, selected -> checked[index] = selected }
                .setNeutralButton(getString(R.string.settings_ambient_select_all), null)
                .setPositiveButton(getString(R.string.save), null)
                .setNegativeButton(getString(R.string.cancel), null).create()
            paletteDialog.setOnShowListener {
                paletteDialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener {
                    checked.fill(true)
                    for (index in checked.indices) paletteDialog.listView.setItemChecked(index, true)
                }
                paletteDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                    val selected = checked.indices.filter { checked[it] }.map { it + 1 }
                    if (selected.isEmpty()) toast(getString(R.string.settings_ambient_select_one))
                    else {
                        draft = draft.copy(selectedColors = selected, color = selected.first())
                        paletteButton.text = getString(R.string.settings_ambient_palette_summary, selected.size)
                        paletteDialog.dismiss()
                    }
                }
            }
            paletteDialog.show()
        }
        body.addView(paletteButton, matchButton(0, 60)); body.addView(space(12))
        choice(body, getString(R.string.settings_ambient_brightness), (0..6).map { if (it == 0) getString(R.string.settings_ambient_minimum) else it.toString() }, draft.brightness, reconnects = false) {
            draft = draft.copy(brightness = it)
        }
        choice(body, getString(R.string.settings_ambient_area), listOf(getString(R.string.settings_ambient_front), getString(R.string.settings_ambient_rear), getString(R.string.settings_ambient_all)), draft.area - 1, reconnects = false) {
            draft = draft.copy(area = it + 1)
        }
        val dialog = AlertDialog.Builder(this).setTitle(getString(R.string.settings_ambient_configuration))
            .setView(ScrollView(this).apply { addView(body) })
            .setPositiveButton(getString(R.string.save), null)
            .setNegativeButton(getString(R.string.cancel), null).create()
        dialog.setOnShowListener {
            val save = dialog.getButton(AlertDialog.BUTTON_POSITIVE)
            save.setOnClickListener {
                val selected = draft.copy(colorCycle = draft.music)
                fun commit() {
                    AmbientMusicSettings.save(this, selected)
                    dialog.dismiss()
                    render()
                }
                if (!selected.enabled) commit()
                else {
                    save.isEnabled = false
                    save.text = getString(R.string.settings_ambient_checking)
                    ambientSupportCheck(applicationContext).whenComplete { supported, _ ->
                        runOnUiThread {
                            if (!dialog.isShowing || isFinishing || isDestroyed) return@runOnUiThread
                            save.isEnabled = true
                            save.text = getString(R.string.save)
                            if (supported == true) commit()
                            else toast(getString(R.string.settings_ambient_unavailable))
                        }
                    }
                }
            }
        }
        dialog.show()
    }

    // [announcesReconnect] labels a choice whose [save] reconnects by itself.
    private fun choice(parent: LinearLayout, title: String, options: List<String>, current: Int, reconnects: Boolean = true,
        announcesReconnect: Boolean = reconnects, enabled: Boolean = true, save: (Int) -> Unit) {
        var selection = current
        val button = button("$title · ${options[selection]}", false) {}.apply { isEnabled = enabled }
        button.setOnClickListener {
            var pendingSelection = selection
            appDialogBuilder().setTitle(title)
                .setSingleChoiceItems(options.toTypedArray(), selection) { _, index -> pendingSelection = index }
                .setPositiveButton(getString(if (announcesReconnect && CarPlayBackgroundSession.hasSession()) R.string.apply_and_reconnect else R.string.save)) { _, _ ->
                    if (pendingSelection != selection) {
                        selection = pendingSelection
                        save(selection)
                        button.text = "$title · ${options[selection]}"
                        if (reconnects && CarPlayBackgroundSession.hasSession()) {
                            connect(AirPlayPersistence.loadWirelessEnabled(this))
                        }
                    }
                }.setNegativeButton(getString(R.string.cancel), null).show()
        }
        parent.addView(button, matchButton(0, 60)); parent.addView(space(12))
    }
    /**
     * A group in the settings, shown the way the home shows its own: no plate, no border,
     * just the words and the controls on the page's own background. The grouping is kept
     * by its padding and its place, not by a panel behind it.
     */
    private fun card() = column().apply { setPadding(dp(24), dp(24), dp(24), dp(24)) }
    private fun column() = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; layoutParams = LinearLayout.LayoutParams(-1, -2) }
    private fun row() = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL; layoutParams = LinearLayout.LayoutParams(-1, -2) }
    private class HeaderTitleView(context: android.content.Context) : TextView(context) {
        private val glyphBounds = android.graphics.Rect()

        override fun onDraw(canvas: android.graphics.Canvas) {
            val value = text.toString()
            paint.getTextBounds(value, 0, value.length, glyphBounds)
            val checkpoint = canvas.save()
            if (layout?.lineCount == 1 && !glyphBounds.isEmpty && baseline >= 0) {
                val textCentre = if (usesChineseGlyphAlignment(resources.configuration.locales[0].language, value)) {
                    baseline + (glyphBounds.top + glyphBounds.bottom) / 2f
                } else {
                    val metrics = paint.fontMetrics
                    baseline + (metrics.ascent + metrics.descent) / 2f
                }
                val contentCentre = paddingTop + (height - paddingTop - paddingBottom) / 2f
                canvas.translate(0f, contentCentre - textCentre)
            }
            super.onDraw(canvas)
            canvas.restoreToCount(checkpoint)
        }
    }

    private fun label(value: String, size: Int, color: Int, bold: Boolean = false, centreGlyphs: Boolean = false) =
        (if (centreGlyphs) HeaderTitleView(this) else TextView(this)).apply {
        text = value; textSize = size.toFloat(); setTextColor(color); gravity = Gravity.CENTER_VERTICAL
        typeface = if (bold) Typeface.create("sans-serif-medium", Typeface.NORMAL) else Typeface.create("sans-serif", Typeface.NORMAL)
        setLineSpacing(dp(3).toFloat(), 1f)
    }
    private fun headerButton(title: String, icon: Int, compact: Boolean, click: () -> Unit) = button(title, false, click).apply {
        alignVisibleGlyphs = false
        if (compact) textSize = 16f
        includeFontPadding = false
        setTextColor(TEXT)
        setSingleLine(true)
        gravity = Gravity.CENTER
        val iconSize = dp(if (compact) 20 else 24)
        val drawable = getDrawable(icon)?.mutate()?.apply {
            setTint(TEXT)
            setBounds(0, 0, iconSize, iconSize)
        }
        setCompoundDrawablesRelative(drawable, null, null, null)
        compoundDrawablePadding = dp(8)
        doOnLayout {
            // Use the same text alignment reference as other buttons in this locale.
            if (baseline >= 0 && text.isNotEmpty()) {
                val glyphCentre = textAlignmentCentreY()
                val drawableCentre = paddingTop + (height - paddingTop - paddingBottom) / 2f
                val offset = (glyphCentre - drawableCentre).roundToInt()
                drawable?.setBounds(0, offset, iconSize, iconSize + offset)
                // Move the aligned icon/text group to the button's visual centre.
                contentOffsetY = drawableCentre - glyphCentre
                invalidate()
            }
        }
    }

    private fun layoutCornerRadius(): Float {
        val compact = isCompactLayout && (page != "settings" || !SettingsLayoutPreferences.isActive(this))
        return dp(if (compact) 44 else 52) * 20f / 56
    }

    private fun buttonShape(color: Int, stroke: Int, heightPx: Int = 0) = rounded(color, stroke).apply {
        cornerRadius = if (heightPx > 0) minOf(dp(24).toFloat(), heightPx * 20f / 56) else layoutCornerRadius()
    }

    private fun buttonFocusRing() = focusRing(
        (layoutCornerRadius() / resources.displayMetrics.density).roundToInt(),
    )

    /**
     * A settings control in the same hand as the home's ghost actions: the words carry the
     * control, with a glow and a hairline underline on the primary one. The filled plate
     * is gone, so a settings page reads like the home rather than a wall of buttons.
     * Its size and its place are unchanged.
     */
    private fun button(title: String, primary: Boolean, click: () -> Unit) = SettingButton(this, MUTED, ACCENT).apply {
        isAllCaps = false
        textSize = 18f
        setTextColor(if (primary) ACCENT else TEXT)
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        setPadding(dp(16), 0, dp(16), 0)
        minHeight = dp(56)
        stateListAnimator = null
        compoundDrawablePadding = dp(12)
        if (primary) {
            // The primary action glows and carries a hairline underline, as on the home.
            setShadowLayer(dp(8).toFloat(), 0f, 0f, (ACCENT and 0x00FFFFFF) or 0x50000000)
            val underline = GradientDrawable(
                GradientDrawable.Orientation.LEFT_RIGHT,
                intArrayOf(
                    (ACCENT and 0x00FFFFFF) or 0x00000000,
                    (ACCENT and 0x00FFFFFF) or 0x99000000.toInt(),
                    (ACCENT and 0x00FFFFFF) or 0x00000000,
                ),
            ).apply { cornerRadius = dp(1).toFloat() }
            val layered = android.graphics.drawable.LayerDrawable(arrayOf(underline))
            layered.setLayerHeight(0, dp(2))
            layered.setLayerGravity(0, Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL)
            background = android.graphics.drawable.RippleDrawable(ColorStateList.valueOf(RIPPLE), layered, null)
        } else {
            // No ripple: an unmasked one spread a large faint circle over the button.
            background = null
        }
        foreground = buttonFocusRing()
        text = title
        searchIndexSink?.add(title.substringBefore(VALUE_SEPARATOR))
        setOnClickListener { click() }
    }


    // For an action whose label happens to contain the separator, such as "Turn on … · ADB".
    private fun actionButton(title: String, primary: Boolean, click: () -> Unit) =
        button(title, primary, click).apply { action = true; text = title }

    /**
     * Text in the "Title · Value" form opens a choice, so it reads as a setting row:
     * start-aligned, muted value, chevron. Any other text stays a centred action button.
     * The plain text is unchanged, so callers and tests keep matching "Title · Value".
     */
    private class SettingButton(
        context: android.content.Context,
        private val muted: Int,
        private val accent: Int,
    ) : Button(context) {
        var action = false
        var contentOffsetY = 0f
        var alignVisibleGlyphs = true
        private val glyphBounds = android.graphics.Rect()

        fun textAlignmentCentreY(): Float {
            if (usesChineseGlyphAlignment(resources.configuration.locales[0].language, text)) {
                val value = text.toString()
                paint.getTextBounds(value, 0, value.length, glyphBounds)
                return baseline + (glyphBounds.top + glyphBounds.bottom) / 2f
            }
            // Keep the baseline stable when labels contain descenders or accents.
            val metrics = paint.fontMetrics
            return baseline + (metrics.ascent + metrics.descent) / 2f
        }

        override fun onDraw(canvas: android.graphics.Canvas) {
            var offset = contentOffsetY
            if (alignVisibleGlyphs) {
                offset = 0f
                // Wrapped labels keep Android's multiline layout. Measure single-line labels
                // on every draw so changing a setting value also updates its visual centre.
                if (layout?.lineCount == 1 && baseline >= 0) {
                    val textCentre = textAlignmentCentreY()
                    val contentCentre = paddingTop + (height - paddingTop - paddingBottom) / 2f
                    offset = contentCentre - textCentre
                }
                // The chevron is already centred by TextView; compensate for the text shift.
                compoundDrawablesRelative.filterNotNull().forEach { drawable ->
                    val bounds = drawable.bounds
                    val top = -offset.roundToInt()
                    drawable.setBounds(bounds.left, top, bounds.right, top + bounds.height())
                }
            }
            val checkpoint = canvas.save()
            canvas.translate(0f, offset)
            super.onDraw(canvas)
            canvas.restoreToCount(checkpoint)
        }

        override fun setText(text: CharSequence?, type: BufferType?) {
            val split = if (action) -1 else text?.indexOf(VALUE_SEPARATOR) ?: -1
            if (text == null || split <= 0) {
                super.setText(text, type)
                gravity = Gravity.CENTER
                setCompoundDrawablesRelative(null, null, null, null)
                return
            }
            val styled = android.text.SpannableString(text).apply {
                setSpan(android.text.style.ForegroundColorSpan(muted), split, text.length,
                    android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            super.setText(styled, BufferType.SPANNABLE)
            gravity = Gravity.CENTER_VERTICAL or Gravity.START
            setCompoundDrawablesRelativeWithIntrinsicBounds(null, null,
                context.getDrawable(R.drawable.ic_dp_chevron)?.mutate()?.apply { setTint(accent) }, null)
        }
    }
    // Remote and D-pad users need to see where they are; touch mode never shows it.
    /** A hairline under a view and nothing else: no fill, ever. */
    private fun focusRing(radiusDp: Int = 20) = android.graphics.drawable.StateListDrawable().apply {
        addState(intArrayOf(android.R.attr.state_focused), GradientDrawable().apply {
            setColor(Color.TRANSPARENT); cornerRadius = dp(radiusDp).toFloat(); setStroke(dp(3), FOCUS_RING)
        })
    }

    private fun rounded(color: Int, stroke: Int) = GradientDrawable().apply { setColor(color); cornerRadius = layoutCornerRadius() * 1.35f; setStroke(dp(1), stroke) }

    private fun space(height: Int) = View(this).apply { layoutParams = LinearLayout.LayoutParams(1, dp(height)); tag = SPACER }

    /**
     * One vertical rhythm for every card, whatever margins each control builder chose:
     * buttons are one height with one gap, a note under a button closes its group with a larger gap,
     * and the last item adds nothing to the card's own padding.
     */
    private fun normalizeSpacing(container: LinearLayout, isCard: Boolean = true) {
        if (container.orientation != LinearLayout.VERTICAL) return
        for (i in container.childCount - 1 downTo 0) {
            if (container.getChildAt(i).tag == SPACER) container.removeViewAt(i)
        }
        fun isNote(view: View?) = view is TextView && view !is Button
        fun isToggleRow(view: View?) = view is LinearLayout && view.orientation == LinearLayout.HORIZONTAL &&
            (0 until view.childCount).any { view.getChildAt(it) is Switch }
        fun isControl(view: View?) = view is Button || isToggleRow(view)
        var previous: View? = null
        var last: View? = null
        var noteFollowsButton = false
        for (i in 0 until container.childCount) {
            val child = container.getChildAt(i)
            val next = container.getChildAt(i + 1)
            val lp = child.layoutParams as? LinearLayout.LayoutParams ?: continue
            when {
                child is Button -> {
                    lp.height = dp(CONTROL_HEIGHT_DP); lp.topMargin = 0
                    lp.bottomMargin = dp(if (isNote(next)) NOTE_ATTACH_GAP_DP else CONTROL_GAP_DP)
                }
                // Toggle rows carried their own vertical padding, which doubled the gap after a button.
                isToggleRow(child) -> {
                    child.setPadding(child.paddingLeft, 0, child.paddingRight, 0)
                    lp.topMargin = 0
                    lp.bottomMargin = dp(if (isNote(next)) NOTE_ATTACH_GAP_DP else CONTROL_GAP_DP)
                }
                child is TextView -> {
                    if (!isNote(previous)) noteFollowsButton = isControl(previous)
                    child.setPadding(child.paddingLeft, 0, child.paddingRight, 0)
                    lp.topMargin = 0
                    // Lines of one note stay together; the gap after the last line closes the group.
                    lp.bottomMargin = dp(when {
                        isNote(next) -> NOTE_LINE_GAP_DP
                        noteFollowsButton -> GROUP_GAP_DP
                        else -> CONTROL_GAP_DP
                    })
                }
                child is LinearLayout && child.orientation == LinearLayout.VERTICAL -> {
                    normalizeSpacing(child, isCard = false)
                    lp.topMargin = 0; lp.bottomMargin = 0
                }
                // Any other row (an icon preview, a status line) gets the same gap; the card heading keeps its padding.
                i > 0 || !isCard -> { lp.topMargin = 0; lp.bottomMargin = dp(CONTROL_GAP_DP) }
            }
            child.layoutParams = lp
            if (child.visibility != View.GONE) last = child
            previous = child
        }
        // A nested group keeps its trailing gap so it does not touch the control after it.
        if (isCard && !(last is LinearLayout && last.orientation == LinearLayout.VERTICAL)) {
            (last?.layoutParams as? LinearLayout.LayoutParams)?.let { it.bottomMargin = 0; last.layoutParams = it }
        }
    }
    // Rounded, not truncated: below 160 dpi dp(1) became 0 and every border vanished.
    private fun dp(value: Int) = (value * resources.displayMetrics.density).roundToInt()

    private fun startAppearanceUpdates() {
        appearanceUpdatesResumed = true
        appearanceObserverRemoval?.invoke()
        appearanceObserverRemoval = AppAppearanceRuntime.observeHost {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                checkForAppearanceChange()
            } else {
                handler.post { if (appearanceUpdatesResumed) checkForAppearanceChange() }
            }
        }
        handler.removeCallbacks(appearancePoll)
        handler.post(appearancePoll)
        applyPendingAppearanceRender()
    }

    private fun checkForAppearanceChange() {
        if (refreshAppearance()) {
            requestAppearanceRender()
        }
    }

    private fun requestAppearanceRender(focusAppearanceButton: Boolean = false) {
        appearanceRenderPending = true
        appearanceButtonFocusPending = appearanceButtonFocusPending || focusAppearanceButton
        if (!appearanceUpdatesResumed || shouldDeferAppearanceRender(
                windowKeyLearning = windowLearning != null,
                serviceKeyLearning = WheelKeyService.isLearning(),
            )
        ) return
        appearanceRenderPending = false
        val restoreAppearanceButton = appearanceButtonFocusPending
        appearanceButtonFocusPending = false
        render(
            appearanceOnly = true,
            preferredFocusTag = APPEARANCE_BUTTON_TAG.takeIf { restoreAppearanceButton },
        )
    }

    private fun applyPendingAppearanceRender() {
        if (!appearanceRenderPending) return
        handler.post {
            if (appearanceRenderPending && appearanceUpdatesResumed &&
                !shouldDeferAppearanceRender(
                    windowKeyLearning = windowLearning != null,
                    serviceKeyLearning = WheelKeyService.isLearning(),
                )
            ) {
                requestAppearanceRender()
            }
        }
    }

    /**
     * The app keeps one appearance: dark. A head unit is read at night and in
     * daylight, and the light theme earned nothing but a bright frame in the dark.
     */
    private fun refreshAppearance(): Boolean {
        if (appNight && palette === CarlinkPalette.DARK) return false
        appNight = true
        palette = CarlinkPalette.DARK
        return true
    }

    // The system draws the next launch's starting window before any app code runs. API 33 is the first
    // release that lets the app choose it; older head units keep the dark frame. Auto stays dark: the time
    // of the next launch is unknown, and a dark frame in daylight is safer than a bright frame at night.
    private fun rememberLaunchAppearance() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) return
        splashScreen.setSplashScreenTheme(R.style.Theme_Xcertplay)
    }

    private fun applyWindowAppearance() {
        window.setBackgroundDrawable(ColorDrawable(palette.background))
        window.statusBarColor = palette.systemBar
        window.navigationBarColor = palette.systemBar
        WindowInsetsControllerCompat(window, window.decorView).apply {
            isAppearanceLightStatusBars = palette.systemBarIconsAreDark
            isAppearanceLightNavigationBars = palette.systemBarIconsAreDark
        }
        applyFullscreenMode()
    }

    private val BG get() = palette.background
    private val SURFACE get() = palette.surface
    private val BUTTON get() = palette.button
    private val BORDER get() = palette.outline
    private val ACCENT get() = palette.accent
    private val ON_ACCENT get() = palette.onAccent
    private val RAIL_SELECTED get() = palette.railSelected
    private val RAIL_SELECTED_BORDER get() = palette.railSelectedOutline
    private val TEXT get() = palette.primaryText
    private val MUTED get() = palette.secondaryText
    private val WARNING get() = palette.warning
    private val READY get() = palette.success
    private val RIPPLE get() = palette.ripple
    private val FOCUS_RING get() = palette.focusRing

    companion object {
        private fun usesChineseGlyphAlignment(language: String, text: CharSequence): Boolean {
            return language == "zh" && text.isNotBlank() &&
                text.none { it in 'A'..'Z' || it in 'a'..'z' }
        }

        internal fun isLauncherIntent(intent: Intent): Boolean =
            intent.action == Intent.ACTION_MAIN && intent.hasCategory(Intent.CATEGORY_LAUNCHER) &&
                !intent.hasExtra("page")

        private const val BYD_VEHICLE_TAG = "Carlink-BYD13"
        private const val VEHICLE_VALIDATION_RETRY_MILLIS = 500L
        private const val ADB_KEY_SAVE_WAIT_MILLIS = 500L
        private const val APPEARANCE_POLL_MILLIS = 2_000L
        private const val APPEARANCE_BUTTON_TAG = "app_appearance_button"
        private const val VALUE_SEPARATOR = " · "
        private const val SEARCH_HIGHLIGHT_MILLIS = 900L
        private const val SPACER = "spacer"
        private const val CONTROL_HEIGHT_DP = 60
        private const val CONTROL_GAP_DP = 12
        private const val GROUP_GAP_DP = 20
        private const val NOTE_LINE_GAP_DP = 4
        private const val NOTE_ATTACH_GAP_DP = 6
        private const val SETTINGS_BLOCK_GAP_DP = 16
    }
}
