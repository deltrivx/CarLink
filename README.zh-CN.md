# EasyConnect / 车机互联

为兼容的比亚迪安卓车机提供有线及无线 CarPlay，采用 DiAuto 风格界面。包名：`net.easyconn.gwmec`。

> 这些项目专注于比亚迪汽车。它们可能在其他品牌上运行，但其他品牌不在支持范围内，也没有增加支持或修复其品牌特定兼容性问题的计划。

## 两个版本

| 版本 | 安装对象 | 说明 |
|---|---|---|
| **定制版**（`CarLink-<版本>.apk`） | 车机 | 带 `android.uid.system`，使用为本机配置的配件身份。 |
| **通用版**（`CarLink-<版本>-generic.apk`） | 任意安卓设备 | 无共享 uid，使用上游配件身份；适用于平板等非系统设备。 |

安装在**车机**上，而不是 iPhone。使用无需越狱、转接器、Mac、账号或认证服务器。核心 CarPlay
不需要 ADB；仪表盘、电量、轮速与驻车影像等可选功能需要 ADB。车机需允许安装 APK。

APK 支持 Android 7.1+（API 25）；Android 7.1–8.1 在实车上尚未确认。无线支持 Wi-Fi 直连、
车机自带热点，或「现有 Wi-Fi / 同一局域网」。

## 许可证

**GNU 通用公共许可证第 3 版**（GPL-3.0），见 [LICENSE](LICENSE)。

本项目是 **DiPlay**（<https://github.com/shihabal3amri/DiPlay>）的衍生作品，而 DiPlay 衍生自
**XcertPlay**，两者均以 GPL-3.0 授权，因此本项目沿用相同条款。

## 上游

此处会跟进上游 DiPlay 中与本地改动不冲突的部分：已从 0.2.19 合入通话与麦克风修复、解码器与
音频时序修正，以及语言包。界面、主页与设置页为本地重新设计。

## 构建

发布构建需要：

- `ANDROID_KEYSTORE_PATH`、`ANDROID_KEYSTORE_PASSWORD`、`ANDROID_KEY_ALIAS`、
  `ANDROID_KEY_PASSWORD` —— 签名密钥。
- `DIPLAY_AUTH_ASSETS_DIR` —— 包含 `offline-mfi/identity.pk8`、`offline-mfi/certificate.p7b`，
  以及用于在线更新检查的 `ota-token.txt`。

这些属于凭证，不是源码，**不在本仓库中**。

```
./gradlew mobile:assembleRelease
```

发布构建启用 R8 混淆与资源压缩。仅保留 Activity 类名（清单按名称引用），其余全部重命名；
并移除 `Log.v` 与 `Log.d` 调用。

## 未经 Apple 认证

本项目是独立的接收器，使用实验性配件身份，仍在测试与不同 iPhone 和车机的兼容性。
本产品未经 Apple 认证。
