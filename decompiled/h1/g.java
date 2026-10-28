package h1;

import h9.n;
import o2.j1;
import t8.z;
import yb.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a9.h implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f6425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6432j;
    public Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6433l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, y8.c cVar, int i7) {
        super(2, cVar);
        this.f6424b = i7;
        this.f6433l = obj;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f6424b) {
            case 0:
                g gVar = new g((h) this.f6433l, cVar, 0);
                gVar.f6432j = obj;
                return gVar;
            case 1:
                g gVar2 = new g((s.h) this.f6433l, cVar, 1);
                gVar2.f6432j = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((s.h) this.f6433l, cVar, 2);
                gVar3.f6432j = obj;
                return gVar3;
            default:
                g gVar4 = new g((j1) this.f6433l, cVar, 3);
                gVar4.f6432j = obj;
                return gVar4;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f6424b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((g) create(kVar, cVar)).invokeSuspend(z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0239  */
    /* JADX WARN: Code duplicated, block: B:90:0x0275 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0277  */
    /* JADX WARN: Code duplicated, block: B:93:0x027d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0058 -> B:23:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:16:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:20:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f3 -> B:46:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f5 -> B:39:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x010f -> B:43:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018d -> B:69:0x01e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x018f -> B:62:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01aa -> B:66:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0237 -> B:92:0x027b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0239 -> B:85:0x024a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0253 -> B:89:0x0272). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
