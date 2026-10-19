# CarLink · Car-Phone Link

[![Latest](https://img.shields.io/github/v/release/deltrivx/CarLink?display_name=tag&sort=semver&label=Latest)](https://github.com/deltrivx/CarLink/releases/latest)
[![Android](https://img.shields.io/badge/Android-9.0%2B-3DDC84?logo=android&logoColor=white)](https://developer.android.com/)
[![Build](https://img.shields.io/badge/Build-FnOS%20local-1E6FA8)](https://github.com/deltrivx/CarLink)
[![Signing](https://img.shields.io/badge/Signing-Freescale%20platform-8a2be2)](https://github.com/deltrivx/CarLink/releases/latest)

A car-phone link application that merges phone projection, media control and vehicle data reading in one app. Supports both Android Auto and CarPlay, offers three connection modes (built-in hotspot, same LAN, WiFi Direct), and exposes vehicle-only features such as battery, wheel speed and dashboard song.

> Current version: **2026.10.19** · Application ID: `net.easyconn.gwmec` · Minimum Android: **9.0 (API 28)**

![Car-phone link](asset/xcertplay_small.png)

## Why CarLink

| Capability | Description |
|---|---|
| Dual protocol projection | Android Auto and CarPlay at the same time, one app for both phone platforms |
| Three connection modes | Built-in car hotspot, same LAN, WiFi Direct — switch by scenario |
| Vehicle data | Battery, charging state, wheel speed and dashboard song, read over ADB |
| Media control | Play/pause/track, with per-generation DiLink key mapping |
| Local build | Built entirely on a local FnOS host, no GitHub Actions |
| Platform signing | Freescale platform signing (`android@freescale.com`), APK Signature Scheme v2 + v3 |

## Connection Modes

| Mode | Description | ADB required |
|---|:---:|:---:|
| Built-in car hotspot | Car opens a hotspot; phone joins via Bluetooth credentials | — |
| Same LAN | Car and phone on the same router | — |
| WiFi Direct | Selectable 2.4G / 5G channel | — |
| Network ADB | `127.0.0.1:5555`, used for vehicle-only features | ✓ |

## Install

Download from [Releases](https://github.com/deltrivx/CarLink/releases/latest):

```text
CarLink-2026.10.19.apk
```

Verify integrity:

```bash
sha256sum -c SHA256SUMS-CarLink.txt
```

**Signing changed**: this release uses Freescale platform signing. If an older build (`v1.3.x`) is installed, uninstall it first, otherwise installation fails with `INSTALL_FAILED_UPDATE_INCOMPATIBLE`.

## Versioning

Versions are date-based, with `-N` appended for multiple releases on the same day:

| Scenario | Format |
|---|---|
| First release of the day | `2026.10.19` |
| Second release of the day | `2026.10.19-2` |
| First release of the next day | `2026.10.20` |

## Difference from the Custom Edition

| Item | CarLink (this repo) | EasyConnect |
|---|---|---|
| Repository | Public | Private |
| Positioning | Generic edition | Custom edition |
| APK naming | `CarLink-<version>.apk` | `EasyConnect-<version>.apk` |

Both use the same Freescale platform signature, but **they cannot overwrite each other**; uninstall one before installing the other.

## Technical Parameters

| Item | Value |
|---|---|
| applicationId | `net.easyconn.gwmec` |
| compileSdk / targetSdk | 37 |
| minSdk | 28 (Android 9.0) |
| AGP / Kotlin | 9.3.0 / 2.2.10 |
| Gradle | 9.5.0 |
| Modules | `common` `mobile` `automotive` `shared` `maphost` `home` |

## Changelog

See [CHANGELOG.md](CHANGELOG.md).
