package ga;

import aa.j0;
import x9.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.a f6101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6102b;

    public o(n.a aVar, int i7) {
        this.f6102b = i7;
        i9.l.e(aVar, "delegate");
        this.f6101a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0222 A[ADDED_TO_REGION, LOOP:1: B:120:0x0222->B:132:0x0253, LOOP_START, PHI: r8
      0x0222: PHI (r8v7 x9.k) = (r8v0 x9.k), (r8v8 x9.k) binds: [B:118:0x021f, B:132:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0224  */
    /* JADX WARN: Code duplicated, block: B:123:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x0253 A[LOOP:1: B:120:0x0222->B:132:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x022b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [x9.k] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v0, types: [x9.k, x9.n] */
    /* JADX WARN: Type inference failed for: r7v21, types: [x9.k] */
    /* JADX WARN: Type inference failed for: r7v22, types: [x9.k] */
    /* JADX WARN: Type inference failed for: r7v24, types: [x9.k] */
    public final boolean a(hb.d dVar, x9.n nVar, x9.k kVar) {
        x9.k kVarI;
        x9.e eVar;
        switch (this.f6102b) {
            case 0:
                if (kVar != null) {
                    return p.c(nVar, kVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 1:
                if (kVar != null) {
                    return p.b(dVar, nVar, kVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            case 2:
                if (kVar != null) {
                    return p.b(dVar, nVar, kVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
            case 3:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (za.d.s(nVar) && za.d.f(kVar) != o0.f14731b) {
                    return x9.o.d(nVar, kVar);
                }
                if (nVar instanceof x9.j) {
                    ((x9.j) nVar).l();
                }
                while (nVar != 0) {
                    nVar = nVar.l();
                    if (((nVar instanceof x9.e) && !za.d.l(nVar)) || (nVar instanceof x9.d0)) {
                        if (nVar != 0) {
                            while (kVar != null) {
                                if (nVar != kVar) {
                                    if (kVar instanceof x9.d0) {
                                        kVar = kVar.l();
                                    } else if ((nVar instanceof x9.d0) || !((j0) ((x9.d0) nVar)).f364e.equals(((j0) ((x9.d0) kVar)).f364e) || !za.d.d(kVar).equals(za.d.d(nVar))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (nVar != 0) {
                    while (kVar != null) {
                        if (nVar != kVar) {
                            if (kVar instanceof x9.d0) {
                                kVar = kVar.l();
                            } else if (nVar instanceof x9.d0) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 4:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (x9.o.f14717a.a(dVar, nVar, kVar)) {
                    if (dVar == x9.o.f14727l) {
                        return true;
                    }
                    if (dVar != x9.o.k && (kVarI = za.d.i(nVar, x9.e.class, true)) != null && (dVar instanceof hb.c)) {
                        return ((hb.c) dVar).f6494a.a().equals(kVarI.a());
                    }
                }
                return false;
            case 5:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                x9.e eVar2 = (x9.e) za.d.i(nVar, x9.e.class, true);
                x9.e eVar3 = (x9.e) za.d.i(kVar, x9.e.class, false);
                if (eVar3 != null) {
                    if (eVar2 != null && za.d.l(eVar2) && (eVar = (x9.e) za.d.i(eVar2, x9.e.class, true)) != null && za.d.r(eVar3.n(), eVar.a())) {
                        return true;
                    }
                    ?? T = nVar instanceof x9.c ? za.d.t((x9.c) nVar) : nVar;
                    x9.e eVar4 = (x9.e) za.d.i(T, x9.e.class, true);
                    if (eVar4 != null) {
                        if (za.d.r(eVar3.n(), eVar4.a()) && dVar != x9.o.f14728m) {
                            if (!(T instanceof x9.c) || (T instanceof x9.j) || dVar == x9.o.f14727l) {
                                return true;
                            }
                            if (dVar != x9.o.k && dVar != null) {
                                nb.w type = dVar.getType();
                                if (za.d.r(type, eVar3)) {
                                    return true;
                                }
                                type.G0();
                            }
                        }
                        return a(dVar, nVar, eVar3.l());
                    }
                }
                return false;
            case 6:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!za.d.d(kVar).r0(za.d.d(nVar))) {
                    return false;
                }
                x9.o.f14729n.getClass();
                return true;
            case 7:
                if (kVar != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 8:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 9:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 10:
                if (kVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            default:
                if (kVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    public final String toString() {
        return this.f6101a.d();
    }
}
