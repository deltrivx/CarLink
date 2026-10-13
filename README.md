# 车机互联

[English](README.en.md) | **简体中文**

[![最新版本](https://img.shields.io/github/v/release/deltrivx/CarLink?display_name=tag&sort=semver&label=最新版本)](https://github.com/deltrivx/CarLink/releases/latest)
[![平台](https://img.shields.io/badge/平台-Android%207.1%2B-3DDC84?logo=android&logoColor=white)](https://github.com/deltrivx/CarLink)

为 Android 设备提供 **CarPlay 接收与投射**，采用 DiAuto 风格界面。包名：`net.easyconn.gwmec`。

> 本项目源自车机场景，也适用于平板、手机等 Android 设备。车机仪表盘、车辆数据等依赖车机硬件与 ADB 授权的能力，仅在对应环境下可用。

![车机互联 主页](docs/assets/home.png)

## 核心能力

| 能力 | 说明 |
|---|---|
| CarPlay 接收 | 有线（USB）与无线两种连接方式，采用本地认证 |
| 无线连接 | 支持 Wi-Fi 直连、设备热点，或「现有 Wi-Fi / 同一局域网」 |
| 主页完成连接 | 等待、重试、停止都在主页，不再单独占用一屏 |
| 显示调节 | 图标与文字大小、分辨率、帧率 |
| 诊断导出 | 本地导出报告；仅在你选择分享时才会发送

## 安装

在**安卓设备**上安装（平板、手机、车机等）。使用无需越狱、转接器、Mac、账号或认证服务器。核心 CarPlay 不需要 ADB。设备需允许安装 APK。

APK 支持 Android 7.1+（API 25）；Android 7.1–8.1 支持尚未确认。

### 安装方式

将 APK 复制到设备存储后用文件管理器打开安装，或：

```bash
adb install -r CarLink-<版本>-generic.apk
```

## 构建

```
./gradlew mobile:assembleRelease
```

发布构建启用 R8 混淆与资源压缩：仅保留 Activity 类名（清单按名称引用），其余重命名；并移除 `Log.v` 与 `Log.d` 调用。

构建需要配件身份（`offline-mfi/identity.pk8`、`offline-mfi/certificate.p7b`）与签名密钥，通过环境变量注入。这些属于凭证，**不在本仓库中**。

## 许可证

**GNU 通用公共许可证第 3 版**（GPL-3.0），见 [LICENSE](LICENSE)。

本项目是 **DiPlay**（<https://github.com/shihabal3amri/DiPlay>）的衍生作品，而 DiPlay 衍生自 **XcertPlay**，两者均以 GPL-3.0 授权，因此本项目沿用相同条款。

## 未经 Apple 认证

本项目是独立的接收器，使用实验性配件身份，仍在测试与不同 iPhone 和设备的兼容性。本产品未经 Apple 认证。
