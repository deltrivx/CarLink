# DiAuto + DiPlay 双协议整合方案

> 分支：`feature/dual-protocol` · 目标：CarLink（基于 DiPlay 的 CarPlay 引擎）合入 DiAuto（Android Auto 引擎），界面沿用 CarLink 现有 UI，新增主页首帧选择安卓/iPhone 连接，配置后自动连接。所有构建走 GitHub Actions。

## 1. 引擎导入

- DiAuto（shihabal3amri/DiAuto，AGPL-3.0）实为 open-headunit 改造版：`com.andrerinas.openheadunit.*`，346 Kotlin + 13 Java，CMake 原生层（自带 ffmpeg 源码/头文件 + 7 个预编译 .so），Shizuku AIDL，protobuf-java 3.25.1。
- 导入为两个 **library 模块**（原为 application）：
  - `auto/` → `:auto`（namespace `com.andrerinas.openheadunit`）
  - `contract/` → `:auto-contract`（namespace `com.andrerinas.openheadunit.contract`）
- 改造点（由 `scripts/transform_diauto.py` 在 runner 上执行）：
  - plugin: `com.android.application` → `android.library`；移除 applicationId/versionCode/versionName/签名/ flavors/`applicationVariants` 块
  - compileSdk 36 → 37（与主工程一致，CI 已装 platforms;android-37.0）
  - NDK 29.0.14206865 → 28.2.13676358（与 build-release.yml 一致）
  - jvmTarget 1.8 → 17；移除 kapt（glide/lifecycle compiler 先摘除，报错再处理）
  - conscrypt 双 flavor 依赖 → 单一 `2.5.3`
  - `project(":contract")` → `project(":auto-contract")`
  - Manifest：`<application>` 属性清空（name/icon/label/theme 等），保留组件声明；由合并进主 App
- 许可：AGPL-3.0，随引擎带入 LICENSE 副本（`auto/DIAUTO_LICENSE`）。**主 App 需转 AGPL-3.0**（待用户确认后改 LICENSE 与 README 徽标）。

## 2. 主页首帧（待导入完成后实施）

- `common` 模块新增 `ProtocolHomeActivity`（或 HomeFrame composable）作为 launcher 首屏：
  - 两个入口：**安卓手机**（DiAuto 引擎）/ **iPhone**（CarPlay 引擎，现有 CarPlayHostActivity）
  - 自动识别：USB attach 时按 VID/PID 分流（Apple → CarPlay；AOAP/Android → 启动 DiAuto `UsbAttachedActivity` 逻辑），无线按 mDNS 服务类型分流
  - 已配置设备自动连接：读取 DiAuto 的 auto-connect 配置与 CarPlay 现有配对记录，首帧直接进入对应引擎，无手动选择
- 不引入 DiAuto 的 LoadingScreenFragment / 后台双开逻辑（与主仓库已取消的等待页、双后台保持一致）；DiAuto 的 `UsbAttachedActivity`/`AutoStartReceiver`/`BootCompleteReceiver` 默认 `enabled=false`，由主工程统一调度，避免与 CarPlay 的 USB 接入抢事件。
- DiAuto 的 BYD 专属依赖（`com.byd.spi.ipc.cursor`、`com.ts.car.someip.service` queries、cluster 相关）全部降级为可选：运行时探测，不存在即隐藏对应功能；主工程里的 DiLink 按键映射保持现状，图标/应用名维持 CarLink（`ic_carplay`/`app_name`）。

## 3. CarLife 并入设计（参考 APK 分析结论)

参考 APK：`CarLife-system-update-net.easyconn.gwmec.apk`（亿连，与本项目同包名 net.easyconn.gwmec）。

- 内含百度车机端 SDK 类：`com.baidu.carlife.sdk.*`（CarLifeMessage 等）、`com.baidu.carlifevehicle.connect.USB_PERMISSION`、`com.baidu.carlife.protobuf.*`（CarlifeMusicInitProto / CarlifeTTSInitProto / CarlifeVideoEncoderInfoProto 等）。
- **法务结论**：SDK 为百度专有代码，不可直接反编译复用进 GPL 仓库；只做协议行为参考。
- 落地路径：新建 `:carlife` 模块，Kotlin 自研 HU 端协议栈：
  - 传输：USB host + AOA 切换（Baidu 附件模式），WiFi 热点/局域网 TCP
  - 协议：protobuf 消息集对照 `stonexu1986/carlife-protocol-analysis-tool`（Apache-2.0）与 `Doris-duo/CarLife-MD-Lib`（Apache-2.0）；`674809/carlife` 含 BCLOUD/keystore，疑似百度内部源码，禁止使用
  - 媒体：H.264 → MediaCodec 解码，音频 AudioTrack，触摸/按键回传
- 优先级排在 DiAuto 合入验证之后。

## 4. 构建与验证

- 分支 CI：`.github/workflows/build-branch.yml`，push 即 `:mobile:assembleDebug`（含 `:auto` 编译），本地零构建。
- 导入工作流：`.github/workflows/import-diauto.yml`（workflow_dispatch，一次性，验证通过后删除）。

## 5. 落地验证记录（2026-10-25）

- **端到端协议验证**：以 Mac 上的模拟手机端（UDP 7999 广播 + 7 通道 TCP + 手机侧状态机应答）对平板实测：
  握手全链（版本协商→统计→设备信息→鉴权→特征配置→视频参数→开始推流）逐条通过；H.264 测试流经通道 2
  到达平板并由 MediaCodec 解码渲染成功（彩条画面截图确认）；心跳保活正常。
- **触控**：发送侧已在平板日志验证（SurfaceView OnTouchListener，坐标按视频分辨率缩放，通道 6 帧）；
  接收侧需真实手机 CarLife App 验证（测试架进程在桌面环境无法长活所致）。
- **修复记录**：编码器重协商循环（videoStarted 守卫）、版本协商匹配后停发 98305（versionMatched 守卫）、
  CarLifeVideoActivity 设 singleTask 防双会话、触控改用 SurfaceView 监听。
- **BYD 通用化结论**：DiAuto 引擎的 BYD 仪表盘/HUD 层自带 `appliesTo()`（厂商/品牌探测）与
  `available()` 运行时探测，非 BYD 设备自动关闭；`com.byd.spi` 仅被动引用。无需改写，满足"改通用"要求。
- **许可**：合并 DiAuto（AGPL-3.0）后主工程已由 GPL-3.0 升级为 AGPL-3.0（LICENSE 与 README 已更新）。
- **测试工具**：`/tmp/fake_phone.py`（模拟手机端，可复用于后续回归）。
