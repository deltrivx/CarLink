package f1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import r2.c3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5165a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5173i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(ContentResolver contentResolver, Uri uri, c3 c3Var, ec.h hVar, Context context, y8.c cVar) {
        super(2, cVar);
        this.f5169e = contentResolver;
        this.f5170f = uri;
        this.f5171g = c3Var;
        this.f5172h = hVar;
        this.f5173i = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(h9.a aVar, y8.c cVar) {
        super(2, cVar);
        this.f5173i = aVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f5165a) {
            case 0:
                u2 u2Var = new u2((h9.a) this.f5173i, cVar);
                u2Var.f5172h = obj;
                return u2Var;
            default:
                u2 u2Var2 = new u2((ContentResolver) this.f5169e, (Uri) this.f5170f, (c3) this.f5171g, (ec.h) this.f5172h, (Context) this.f5173i, cVar);
                u2Var2.f5167c = obj;
                return u2Var2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fc.e eVar = (fc.e) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f5165a) {
            case 0:
                ((u2) create(eVar, cVar)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            default:
                return ((u2) create(eVar, cVar)).invokeSuspend(t8.z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f1 A[Catch: all -> 0x0255, LOOP:1: B:74:0x01a8->B:90:0x01f1, LOOP_END, TryCatch #3 {all -> 0x0255, blocks: (B:82:0x01d9, B:98:0x0206, B:101:0x0215, B:105:0x022f, B:107:0x0238, B:86:0x01e4, B:90:0x01f1), top: B:144:0x01d9 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0250 -> B:113:0x0251). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009c -> B:20:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.u2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
