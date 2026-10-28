package d8;

import b8.n2;
import cc.y;
import java.util.Iterator;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2 f3827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f3828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n2 f3831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n2 n2Var, y8.c cVar) {
        super(2, cVar);
        this.f3831e = n2Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new q(this.f3831e, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((y) obj, (y8.c) obj2)).invokeSuspend(z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a2 -> B:22:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a6 -> B:24:0x00e9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
