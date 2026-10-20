# CarLink · 车机互联

[![最新版本](https://img.shields.io/github/v/release/deltrivx/CarLink?display_name=tag&sort=semver&label=最新版本)](https://github.com/deltrivx/CarLink/releases/latest)
[![Android](https://img.shields.io/badge/Android-9.0%2B-3DDC84?logo=android&logoColor=white)](https://developer.android.com/)
[![构建](https://img.shields.io/badge/构建-GitHub%20Actions-2088FF)](https://github.com/deltrivx/CarLink)
[![签名](https://img.shields.io/badge/签名-飞思平台-8a2be2)](https://github.com/deltrivx/CarLink/releases/latest)

面向车机与手机的互联应用，把手机投屏、媒体控制与车机数据读取融为一体。支持 Android Auto 与 CarPlay 双协议，内置热点、同局域网、WiFi Direct 三种连接方式，并提供电量、车速、仪表盘歌曲等车机专有功能。

> 版本号按发布日期自动生成（`YYYY.MM.DD`，同日多版 `-N`）· 应用 ID：`net.easyconn.gwmec` · 最低 Android：**9.0（API 28）**

![车机互联](asset/xcertplay_small.png)

## 为什么选择 CarLink

| 能力 | 说明 |
|---|---|
| 双协议投屏 | Android Auto 与 CarPlay 同时支持，一套应用覆盖两类手机 |
| 三种连接 | 车机内置热点、同一局域网、WiFi Direct，按场景切换 |
| 车机数据 | 电量、充电状态、车速、仪表盘歌曲，经 ADB 读取 |
| 媒体控制 | 播放/暂停/切歌，兼容 DiLink 各代按键映射 |
| 本地构建 | 由 GitHub Actions 云端自动化构建与双包飞思签名开源发布 |
| 平台签名 | 飞思卡尔平台签名（`android@freescale.com`），APK Signature Scheme v2 + v3 |

## 连接方式

| 方式 | 说明 | 需要 ADB |
|---|:---:|:---:|
| 车机内置热点 | 车机开热点，手机蓝牙传凭据自动加入 | — |
| 同一局域网 | 车机与手机接同一路由器 | — |
| WiFi Direct | 可选 2.4G / 5G 信道 | — |
| 网络 ADB | `127.0.0.1:5555`，用于车机专有功能 | ✓ |

## 安装与下载

从 [最新 Releases](https://github.com/deltrivx/CarLink/releases/latest) 下载开源预编译 APK：

| 产物名称 | 适用场景 | 权限特性 | 签名方案 |
|---|---|---|---|
| **`CarLink.apk`** | 普通安卓设备、车载平板、通用车机 | 通用权限（无系统 uid 限制） | 飞思平台签名（v1/v2/v3） |
| **`EasyConnect.apk`** | 原厂定制要求车机、特定系统环境 | 含 `android.uid.system` 权限 | 飞思平台签名（v1/v2/v3） |

校验文件完整性：

```bash
sha256sum -c SHA256SUMS.txt
```

**签名已变更**：本版本起改用飞思卡尔平台签名。若设备上装有旧版本（`v1.3.x`），须先卸载旧版再安装，否则会报 `INSTALL_FAILED_UPDATE_INCOMPATIBLE`。

## 版本号规则

版本号按日期命名，同日多个版本加 `-N` 区分：

| 场景 | 写法 |
|---|---|
| 当日首版 | `2026.10.21.1` |
| 当日第二版 | `2026.10.21.2` |
| 次日首版 | `2026.10.22.1` |

## 与定制版的区别

| 项 | CarLink（本仓） | EasyConnect |
|---|---|---|
| 仓库 | 公开 | 私有 |
| 定位 | 通用版 | 定制版 |
| APK 命名 | `CarLink-<版本>.apk` | `EasyConnect-<版本>.apk` |

两者签名相同（同为飞思平台签名），但**不可互相覆盖安装**，须分别卸载后安装。

## 技术参数

| 项 | 值 |
|---|---|
| applicationId | `net.easyconn.gwmec` |
| compileSdk / targetSdk | 37 |
| minSdk | 28（Android 9.0） |
| AGP / Kotlin | 9.3.0 / 2.2.10 |
| Gradle | 9.5.0 |
| 模块 | `common` `mobile` `automotive` `shared` `maphost` `home` |

## 更新日志

见 [CHANGELOG.md](CHANGELOG.md)。
