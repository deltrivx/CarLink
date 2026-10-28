package rc;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t8.b f12342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j.g f12343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f12344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j.g f12348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12349h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j.g gVar, a9.a aVar) {
        super(aVar);
        this.f12348g = gVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f12347f = obj;
        this.f12349h |= Integer.MIN_VALUE;
        return j.g.a(this.f12348g, null, this);
    }
}
