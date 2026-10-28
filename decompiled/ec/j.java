package ec;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f4711a = new p(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4712b = hc.a.j("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4713c = hc.a.j("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hc.s f4714d = new hc.s(0, "BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hc.s f4715e = new hc.s(0, "SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hc.s f4716f = new hc.s(0, "S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hc.s f4717g = new hc.s(0, "RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hc.s f4718h = new hc.s(0, "POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hc.s f4719i = new hc.s(0, "DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final hc.s f4720j = new hc.s(0, "INTERRUPTED_SEND");
    public static final hc.s k = new hc.s(0, "INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final hc.s f4721l = new hc.s(0, "CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final hc.s f4722m = new hc.s(0, "SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final hc.s f4723n = new hc.s(0, "SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hc.s f4724o = new hc.s(0, "FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final hc.s f4725p = new hc.s(0, "NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final hc.s f4726q = new hc.s(0, "CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final hc.s f4727r = new hc.s(0, "CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final hc.s f4728s = new hc.s(0, "NO_CLOSE_CAUSE");

    public static final boolean a(cc.j jVar, Object obj, h9.o oVar) {
        hc.s sVarF = jVar.f(obj, oVar);
        if (sVarF == null) {
            return false;
        }
        jVar.z(sVarF);
        return true;
    }
}
