package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements x9.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nb.p0 f448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x9.k f449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x9.x f450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ga.o f451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x9.t f452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f457j;
    public nb.w k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public wa.e f458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u8.w f464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y9.h f465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f470x;

    public y(z zVar, nb.p0 p0Var, x9.k kVar, x9.x xVar, ga.o oVar, int i7, List list, List list2, a0 a0Var, nb.w wVar) {
        if (p0Var == null) {
            a(0);
            throw null;
        }
        if (kVar == null) {
            a(1);
            throw null;
        }
        if (xVar == null) {
            a(2);
            throw null;
        }
        if (oVar == null) {
            a(3);
            throw null;
        }
        if (i7 == 0) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (wVar == null) {
            a(7);
            throw null;
        }
        this.f470x = zVar;
        this.f452e = null;
        this.f457j = zVar.f481j;
        this.f459m = true;
        this.f460n = false;
        this.f461o = false;
        this.f462p = false;
        this.f463q = zVar.f489s;
        this.f464r = null;
        this.f465s = null;
        this.f466t = zVar.f490t;
        this.f467u = new LinkedHashMap();
        this.f468v = null;
        this.f469w = false;
        this.f448a = p0Var;
        this.f449b = kVar;
        this.f450c = xVar;
        this.f451d = oVar;
        this.f453f = i7;
        this.f454g = list;
        this.f455h = list2;
        this.f456i = a0Var;
        this.k = wVar;
        this.f458l = null;
    }

    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                i10 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                objArr[0] = "additionalAnnotations";
                break;
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            default:
                objArr[0] = "substitution";
                break;
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i7) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[1] = "setContextReceiverParameters";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                objArr[1] = "setSubstitution";
                break;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                objArr[1] = "putUserData";
                break;
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                objArr[1] = "getSubstitution";
                break;
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i7) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                objArr[2] = "setSubstitution";
                break;
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // x9.s
    public final x9.s D() {
        this.f464r = u8.w.f13122a;
        return this;
    }

    @Override // x9.s
    public final x9.s H() {
        this.f463q = true;
        return this;
    }

    @Override // x9.s
    public final x9.s P(wa.e eVar) {
        if (eVar != null) {
            this.f458l = eVar;
            return this;
        }
        a(17);
        throw null;
    }

    @Override // x9.s
    public final x9.s S() {
        this.f460n = true;
        return this;
    }

    @Override // x9.s
    public final x9.t build() {
        return this.f470x.F0(this);
    }

    @Override // x9.s
    public final x9.s c(y9.h hVar) {
        if (hVar != null) {
            this.f465s = hVar;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // x9.s
    public final x9.s e(nb.w wVar) {
        if (wVar != null) {
            this.k = wVar;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // x9.s
    public final x9.s f(List list) {
        this.f454g = list;
        return this;
    }

    @Override // x9.s
    public final x9.s i(x9.x xVar) {
        if (xVar != null) {
            this.f450c = xVar;
            return this;
        }
        a(10);
        throw null;
    }

    @Override // x9.s
    public final x9.s j(x9.k kVar) {
        if (kVar != null) {
            this.f449b = kVar;
            return this;
        }
        a(8);
        throw null;
    }

    @Override // x9.s
    public final x9.s k(int i7) {
        if (i7 != 0) {
            this.f453f = i7;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // x9.s
    public final x9.s m(ga.o oVar) {
        if (oVar != null) {
            this.f451d = oVar;
            return this;
        }
        a(12);
        throw null;
    }

    @Override // x9.s
    public final x9.s n() {
        this.f461o = true;
        return this;
    }

    @Override // x9.s
    public final x9.s t() {
        this.f467u.put(ia.e.G, Boolean.TRUE);
        return this;
    }

    @Override // x9.s
    public final x9.s u() {
        this.f466t = true;
        return this;
    }

    @Override // x9.s
    public final x9.s v() {
        this.f459m = false;
        return this;
    }

    @Override // x9.s
    public final x9.s x(a0 a0Var) {
        this.f457j = a0Var;
        return this;
    }
}
