package b8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v9 b8.f2[], still in use, count: 1, list:
  (r7v9 b8.f2[]) from 0x0134: CONSTRUCTOR (r7v9 b8.f2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class f2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("KEYCODE_MEDIA", "打开媒体"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("KEYCODE_MEDIA_START", "播放"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("KEYCODE_NAV", "打开导航"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("KEYCODE_SEEK_SUB", "上一首"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("KEYCODE_MEDIA_PLAY_PAUSE", "播放/暂停"),
    /* JADX INFO: Fake field, exist only in values array */
    EF73("KEYCODE_SEEK_ADD", "下一首"),
    /* JADX INFO: Fake field, exist only in values array */
    EF89("KEYCODE_MAIN", "主页切换"),
    /* JADX INFO: Fake field, exist only in values array */
    EF103("KEYCODE_MEDIA_STOP", "暂停"),
    /* JADX INFO: Fake field, exist only in values array */
    EF118("KEYCODE_BACK", "返回"),
    /* JADX INFO: Fake field, exist only in values array */
    EF131("KEYCODE_VR_START", "语音助手"),
    /* JADX INFO: Fake field, exist only in values array */
    EF146("KEYCODE_MOVE_UP", "上"),
    /* JADX INFO: Fake field, exist only in values array */
    EF159("KEYCODE_VR_STOP", "语音停止"),
    /* JADX INFO: Fake field, exist only in values array */
    EF176("KEYCODE_MOVE_LEFT", "左"),
    /* JADX INFO: Fake field, exist only in values array */
    EF193("KEYCODE_OK", "确认"),
    /* JADX INFO: Fake field, exist only in values array */
    EF210("KEYCODE_MOVE_RIGHT", "右"),
    /* JADX INFO: Fake field, exist only in values array */
    EF224("KEYCODE_PHONE_CALL", "电话接听"),
    /* JADX INFO: Fake field, exist only in values array */
    EF239("KEYCODE_MOVE_DOWN", "下"),
    /* JADX INFO: Fake field, exist only in values array */
    EF253("KEYCODE_PHONE_END", "电话挂断");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e2 f1583c = new e2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1584d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b9.b f1586f = new b9.b(new f2[]{new f2("KEYCODE_MEDIA", "打开媒体"), new f2("KEYCODE_MEDIA_START", "播放"), new f2("KEYCODE_NAV", "打开导航"), new f2("KEYCODE_SEEK_SUB", "上一首"), new f2("KEYCODE_MEDIA_PLAY_PAUSE", "播放/暂停"), new f2("KEYCODE_SEEK_ADD", "下一首"), new f2("KEYCODE_MAIN", "主页切换"), new f2("KEYCODE_MEDIA_STOP", "暂停"), new f2("KEYCODE_BACK", "返回"), new f2("KEYCODE_VR_START", "语音助手"), new f2("KEYCODE_MOVE_UP", "上"), new f2("KEYCODE_VR_STOP", "语音停止"), new f2("KEYCODE_MOVE_LEFT", "左"), new f2("KEYCODE_OK", "确认"), new f2("KEYCODE_MOVE_RIGHT", "右"), new f2("KEYCODE_PHONE_CALL", "电话接听"), new f2("KEYCODE_MOVE_DOWN", "下"), new f2("KEYCODE_PHONE_END", "电话挂断")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1588b;

    static {
    }

    public f2(String str, String str2) {
        super(str, i);
        this.f1587a = str2;
        this.f1588b = i;
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) f1585e.clone();
    }
}
