package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14302b;

    public /* synthetic */ a(f fVar, int i7) {
        this.f14301a = i7;
        this.f14302b = fVar;
    }

    @Override // h9.a
    public final Object invoke() {
        q2.l lVar;
        switch (this.f14301a) {
            case 0:
                f1.c0 c0Var = androidx.compose.foundation.c.f779a;
                f fVar = this.f14302b;
                n0 n0Var = (n0) q2.f.i(fVar, c0Var);
                if (!(n0Var instanceof r0)) {
                    c0.b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + n0Var);
                }
                r0 r0Var = fVar.f14357y;
                r0 r0Var2 = (r0) n0Var;
                fVar.f14357y = r0Var2;
                if (r0Var != null && !i9.l.a(r0Var2, r0Var) && ((lVar = fVar.A) != null || !fVar.G)) {
                    if (lVar != null) {
                        fVar.B0(lVar);
                    }
                    fVar.A = null;
                    fVar.I0();
                }
                return t8.z.f12851a;
            default:
                this.f14302b.f14355w.invoke();
                return Boolean.TRUE;
        }
    }
}
