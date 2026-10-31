# AGENTS.md — CarLink

仓库级 agent 工作约定。`CLAUDE.md` 通过 `@AGENTS.md` 引用本文件。

## 项目概要

- **产品**：CarLink · 车机互联 — 面向车机/车载平板的 CarPlay（DiPlay 引擎）+ CarLife 双协议投屏应用。
- **applicationId**：`net.easyconn.gwmec`（双版本同包名）。
- **许可**：AGPL-3.0（合入 DiAuto 引擎后由 GPL-3.0 升级，见 LICENSE）。

## 构建（硬性要求）

- **禁止本地构建**。所有构建走 GitHub Actions：
  - `.github/workflows/build-branch.yml` — 分支构建检查
  - `.github/workflows/build-release.yml` — 打 tag 后的双包正式发布
  - `.github/workflows/import-diauto.yml` — DiAuto 引擎一次性导入
- 发布方式：打日期 tag（如 `2026.10.31.08`）自动触发 release 构建。
- 签名 secrets：`PLATFORM_PK8_BASE64`、`PLATFORM_PEM_BASE64`；MFi 资产：`DEPLAY_AUTH_ASSETS_BASE64`。

## 版本与产物

- **版本号**：`YYYY.MM.DD.NN`（同日递增，末段固定两位，CI 自动补零）；`versionCode` = 日期 + 末段，如 `2026103108`。
- **产物：固定名、仅两个 APK**：
  - `CarLink.apk` — 通用版，无 `sharedUserId`；OTA（`UpdateCatalog.GENERIC_APK_SUFFIX`）按 `CarLink.apk` 解析
  - `EasyConnect.apk` — 定制版，仅多 `android:sharedUserId="android.uid.system"`
  - `SHA256SUMS.txt` — 同时覆盖两个 APK
  - ⚠️ 不要再上传 `CarLink-generic.apk` / `SHA256SUMS-generic.txt` 副本：多出的 `.apk` 会被通用分支之外的解析逻辑误认成定制包，且 `SHA256SUMS.txt` 没有它的条目，校验必失败
- 双版本同包名、同平台签名（v1/v2/v3）、同 MFi 资产；互相不可覆盖安装。
- 应用显示名统一为 `车机互联`（勿在 debug manifest 覆盖成测试名）。

## 技术参数

| 项 | 值 |
|---|---|
| minSdk | 25（`mobile`/`common`）；`auto`/`contract` 28；`carlife` 24 |
| compileSdk / targetSdk | 37 |
| AGP / Kotlin | 9.3.0 / 2.2.10 |
| Gradle | 9.5.0 |
| 模块 | `common` `mobile` `automotive` `shared` `auto` `auto-contract` `carlife` `maphost` `home` |

## 模块导览

- `mobile/` — 主入口 APK 模块（release 构建目标 `:mobile:assembleRelease`）
- `common/` — 共享 UI 与编排（CarlinkActivity、CarLifeVideoActivity、CarPlayController、update/ OTA 等）
- `carlife/` — CarLife 协议栈（UsbTransport、Protocol、Session；行为须对齐 `upstream-oss/CarLife-Android-Vehicle/` 原版与 `decompiled/` 反编译产物）
- `auto/` — DiPlay/CarPlay 引擎（源自上游 DiAuto/DiPlay）
- `docs/` — 设计与排障文档；`decompiled/`、`upstream-oss/` 为只读参考，勿修改

## 代码约定

- 改动协议/解码逻辑前，先核对原版实现（`upstream-oss/` 源码或 `decompiled/` 反编译），写明对齐依据，不自行发明"保护性"逻辑。
- 反编译目录仅作参考对照，不参与编译。
- 提交信息风格：`type(scope): summary`（英文，如 `fix(carlife/video): ...`）。
- 文档改动（README/AGENTS）与代码改动分开提交。
