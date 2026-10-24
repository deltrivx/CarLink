package net.easyconn.gwmec.carlife

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import net.easyconn.gwmec.CarPlayHostActivity

/**
 * 双协议主页首帧：选择安卓手机（CarLife）或 iPhone（CarPlay）。
 * 开启自动连接后，检测到手机 CarLife 局域网广播即直接进入投屏。
 */
class ProtocolHomeActivity : Activity() {
    private lateinit var prefs: SharedPreferences
    private lateinit var status: TextView
    private lateinit var autoBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs = getSharedPreferences("carlink_home", MODE_PRIVATE)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
        }
        val title = TextView(this).apply {
            text = "车机互联"
            textSize = 28f
            gravity = Gravity.CENTER
        }
        status = TextView(this).apply {
            text = "选择连接方式"
            textSize = 14f
            gravity = Gravity.CENTER
            setPadding(0, 24, 0, 48)
        }
        val carLifeButton = Button(this).apply {
            text = "安卓手机（CarLife）"
            setOnClickListener { startActivity(Intent(this@ProtocolHomeActivity, CarLifeVideoActivity::class.java)) }
        }
        val carPlayButton = Button(this).apply {
            text = "iPhone（CarPlay）"
            setOnClickListener {
                try {
                    startActivity(Intent(this@ProtocolHomeActivity, CarPlayHostActivity::class.java))
                } catch (e: Exception) {
                    status.text = "CarPlay 启动失败：${e.message}"
                }
            }
        }
        autoBox = CheckBox(this).apply {
            text = "自动连接（检测到手机 CarLife 广播后直接进入）"
            isChecked = prefs.getBoolean(KEY_AUTO, true)
            setOnCheckedChangeListener { _, checked ->
                prefs.edit().putBoolean(KEY_AUTO, checked).apply()
                if (checked) startDiscovery()
            }
        }
        root.addView(title)
        root.addView(status)
        root.addView(carLifeButton)
        root.addView(carPlayButton)
        root.addView(autoBox)
        setContentView(root)
    }

    override fun onResume() {
        super.onResume()
        if (autoBox.isChecked) startDiscovery()
    }

    override fun onPause() {
        super.onPause()
        CarLifeDiscovery.stop()
    }

    private fun startDiscovery() {
        status.text = "等待手机 CarLife 广播（UDP 7999）…"
        CarLifeDiscovery.start { phoneIp ->
            runOnUiThread {
                status.text = "发现手机 $phoneIp，进入投屏…"
                startActivity(Intent(this, CarLifeVideoActivity::class.java))
            }
        }
    }

    companion object { private const val KEY_AUTO = "auto_connect" }
}
