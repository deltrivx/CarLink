package e8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v4 e8.s[], still in use, count: 1, list:
  (r13v4 e8.s[]) from 0x00c8: CONSTRUCTOR (r13v4 e8.s[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("EXTRA_ALL", "监听全部"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("EXTRA_GUIDE_INFO", "引导信息发送"),
    /* JADX INFO: Fake field, exist only in values array */
    EF31("EXTRA_START", "开始导航"),
    /* JADX INFO: Fake field, exist only in values array */
    EF43("EXTRA_STOP", "结束导航"),
    /* JADX INFO: Fake field, exist only in values array */
    EF55("EXTRA_HEADLIGHT_REQUEST", "大灯状态请求"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67("EXTRA_HEADLIGHT_STATE", "大灯状态通知"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("EXTRA_SETTING_TYPE", "地图状态发送"),
    /* JADX INFO: Fake field, exist only in values array */
    EF97("EXTRA_DAY_NIGHT_MODE", "昼夜模式"),
    /* JADX INFO: Fake field, exist only in values array */
    EF114("EXTRA_ROAD_INFO", "当前路线信息透出"),
    /* JADX INFO: Fake field, exist only in values array */
    EF131("HUD_IS_OPEN", "精简导航"),
    /* JADX INFO: Fake field, exist only in values array */
    EF148("EXTRA_GEOLOCATION", "GPS定位状态"),
    /* JADX INFO: Fake field, exist only in values array */
    EF165("EXTRA_ACTIVATE_STATE", "导航透出激活状态");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f4612c = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b9.b f4614e = new b9.b(new s[]{new s("EXTRA_ALL", "监听全部"), new s("EXTRA_GUIDE_INFO", "引导信息发送"), new s("EXTRA_START", "开始导航"), new s("EXTRA_STOP", "结束导航"), new s("EXTRA_HEADLIGHT_REQUEST", "大灯状态请求"), new s("EXTRA_HEADLIGHT_STATE", "大灯状态通知"), new s("EXTRA_SETTING_TYPE", "地图状态发送"), new s("EXTRA_DAY_NIGHT_MODE", "昼夜模式"), new s("EXTRA_ROAD_INFO", "当前路线信息透出"), new s("HUD_IS_OPEN", "精简导航"), new s("EXTRA_GEOLOCATION", "GPS定位状态"), new s("EXTRA_ACTIVATE_STATE", "导航透出激活状态")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4616b;

    static {
    }

    public s(String str, String str2) {
        super(str, i);
        this.f4615a = str2;
        this.f4616b = i;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f4613d.clone();
    }
}
