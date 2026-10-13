# EasyConnect / 车机互联

**CarPlay for compatible BYD Android head units.** Wired and wireless, with the familiar DiAuto
interface. Package: `net.easyconn.gwmec`.

> **Scope.** These projects focus on BYD cars. They may work on other brands, but other brands are
> unsupported and there are no plans to add support or fix brand-specific incompatibilities.

## Two builds

| Build | Install target | Notes |
|---|---|---|
| **Custom** (`CarLink-<version>.apk`) | The car's own build | Carries `android.uid.system` and the accessory identity provisioned for that install. |
| **Generic** (`CarLink-<version>-generic.apk`) | Any Android device | No shared uid; uses the upstream accessory identity. For tablets and other non-system devices. |

Install on the **car**, not the iPhone. No jailbreak, dongle, Mac, account or authentication server
is required for use. Core CarPlay does not require ADB; optional dashboard, battery, wheel-speed and
parked-video features do. Your head unit must permit APK installation.

The APK supports Android 7.1+ (API 25); Android 7.1–8.1 support is not yet confirmed on a vehicle.
Wireless supports Wi-Fi Direct, the car's existing hotspot, or Existing Wi-Fi / same LAN.

## License

**GNU General Public License v3.0** — see [LICENSE](LICENSE).

This is a derivative work of **DiPlay** (<https://github.com/shihabal3amri/DiPlay>), itself derived
from **XcertPlay**, both licensed under GPL-3.0. It is therefore distributed under the same terms.

## Upstream

Changes here track upstream DiPlay where they do not conflict with local work: call and microphone
fixes, decoder and audio timing, and translations have been brought in from 0.2.19. The interface,
the home screen and the settings are restyled locally.

## Building

Release builds need:

- `ANDROID_KEYSTORE_PATH`, `ANDROID_KEYSTORE_PASSWORD`, `ANDROID_KEY_ALIAS`, `ANDROID_KEY_PASSWORD`
  — the signing key.
- `DIPLAY_AUTH_ASSETS_DIR` — a directory holding `offline-mfi/identity.pk8`,
  `offline-mfi/certificate.p7b` and, for over-the-air update checks, `ota-token.txt`.

These are credentials, not source. They are not in this repository.

```
./gradlew mobile:assembleRelease
```

The release build runs R8 with resource shrinking. Only the activities keep their names, because the
manifest points at them by name; everything else is renamed. `Log.v` and `Log.d` are stripped.

## Not Apple-certified

This is an independent receiver. It uses an experimental accessory identity and is still being
tested for compatibility across iPhones and head units. It is not an Apple-certified product.
