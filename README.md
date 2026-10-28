# CarLink · CarLife 源码与参考实现

本仓库用于 CarLink 项目（[github.com/deltrivx/CarLink](https://github.com/deltrivx/CarLink)）的开发参考，
收录两份 CarLife 车机端代码材料：

| 目录 | 内容 | 说明 |
|---|---|---|
| `decompiled/` | 从百度 CarLife 车机版 APK 反编译出的 Java 源码 | 用于协议/行为研究 |
| `upstream-oss/` | 百度开源 CarLife 车机端源码（Apache-2.0） | 可读、可编译的参考实现 |

---

## 1. `decompiled/` — APK 反编译源码

### 来源

- 应用：百度 CarLife 车机版（`com.baidu.carlifevehicle`）
- 版本：`2026.01.31.1511-baidu`（versionCode `2026013115`）
- 来源设备：小米平板 `22081281AC`（Android 14 / API 34），经无线 ADB 从 `/data/app/.../base.apk` 导出
- APK SHA-256：`5d0658d7323ef87dbfe59bfdcdc3bae25dfe0bbea4dd75082899435ab5f128d3`
- 大小：4,457,155 字节，单一 `base.apk`（无 split APK），1 个 dex，5 个 ABI 原生库
- 工具：jadx 1.5.6（`--no-res --no-debug-info`）

### 结构

- 反编译出 5,266 个 Java 文件，其中 94 个文件因混淆/内联存在局部反编译失败。
- **包名被重度混淆**：绝大多数类位于 `a`、`a2`、`l8`、`c1`、`r2` 这类单/双字符包下，
  类名与方法名同样被混淆，**不具备直接可读性**。
- 未被混淆、可直接阅读的部分：
  - `com/baidu/carlife/protobuf/`（74 个 protobuf 消息类）
  - `com/baidu/carlife/sdk/`（CarLife SDK：连接、传输、协议、加解密）
  - `com/baidu/carlife/sdk/receiver/transport/`（AOA / 蓝牙 / 热点 / 直连四种传输）
  - `com/baidu/carlifevehicle/`、`com/muyetuge/carlifevehicle/`
  - `com/baidu/carlife/sdk/internal/protocol/`（协议编解码）

### 用途

这份反编译代码的价值在于**协议层与 SDK 结构的真实样本**：CarLife 的消息类型、
传输层抽象、AOA（Android Open Accessory）握手流程，都可以从这里读到实际实现。
由于混淆严重，它不适合直接作为代码基线，适合与 `upstream-oss/` 的开源实现对照阅读。

---

## 2. `upstream-oss/` — 开源参考实现

### 来源

- 仓库：<https://github.com/674809/carlife>（Apollo-DuerOS 项目的一部分）
- 上游原始出处：`ApolloAuto/apollo-DuerOS` 的 `CarLife-Android-Vehicle`
- 许可证：**Apache-2.0**（见 `upstream-oss/LICENSE`）
- 最后提交：2022-07-19

### 内容

- `CarLife-Android-Vehicle/` — CarLife 车机端 Android 实现（187 个 Java 文件）
  - `src/com/baidu/carlife/protobuf/`（57 个消息类）
  - `src/com/baidu/carlifevehicle/`（connect / fragment / util / audioplayer / bluetooth /
    vehicledata / view / encryption / logic / message / service / touch 等子包）
- `CarLife-Vehicle-Lib/` — C++ 跨平台 CarLife 协议库（88 个 C/C++ 源文件）

### 与反编译版本的差异

| 项 | 开源版（2022） | APK 版（2026） |
|---|---|---|
| protobuf 类数 | 57 | 74 |
| `com/baidu/carlife/sdk/` | 无 | 有（完整 SDK 分层） |
| 混淆 | 无 | 重度 |

开源版的 57 个 protobuf 类**全部包含**在 APK 版的 74 个之中；APK 版多出 17 个，
包括 `CarlifeVehicleControlProto`、`CarlifeVehicleDataListProto`、`CarlifeThemeChangeProto`、
`CarlifeFileTransferBeginProto`、`CarlifeConnectTimeSyncProto` 等，反映 2022 年之后协议的新增能力。
同时 APK 版把传输层重构成了 `sdk/receiver/transport/` 下的分层结构，
而开源版是扁平的 `carlifevehicle/connect/`。

> 因此：**协议格式以 APK 反编译版为准，架构与可读性以开源版为准。**

---

## 3. 已移除的敏感内容

上传前已做以下清理，**请勿回填**：

- 删除 `CarLife-Android-Vehicle/carlife.keystore`、`debug.keystore`
- 将 `ant.properties`、`project.properties` 中的 keystore 明文密码替换为 `REMOVED_SEE_DOCS`
- 删除 `.DS_Store` 等垃圾文件

---

## 4. 法律与合规注意

- `upstream-oss/` 为 Apache-2.0 许可，可自由使用、修改、分发，需保留许可声明。
- `decompiled/` 来自百度 CarLife 闭源 APK 的反编译产物，**百度 CarLife 本身并非开源软件**。
  这部分内容仅用于**互操作性研究与 CarLink 项目的技术参考**，不应视为可自由分发的源码，
  也不建议直接商用。分发前请自行评估法律风险。

---

## 5. 相关项目

- **CarLink**（本仓库所属项目）：<https://github.com/deltrivx/CarLink>
  面向 BYD 安卓车机的 CarPlay 接收器，GPL-3.0。
- **CarLink-Backup**（原 CarLink 仓库，已改名备用）：<https://github.com/deltrivx/CarLink-Backup>
