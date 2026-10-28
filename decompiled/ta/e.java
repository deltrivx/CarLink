package ta;

import i9.l;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f12885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f12886h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12887f;

    static {
        e eVar = new e(new int[]{2, 1, 0}, false);
        f12885g = eVar;
        int i7 = eVar.f12856c;
        int i10 = eVar.f12855b;
        f12886h = (i10 == 1 && i7 == 9) ? new e(new int[]{2, 0, 0}, false) : new e(new int[]{i10, i7 + 1, 0}, false);
        new e(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        l.e(iArr, "versionArray");
        this.f12887f = z10;
    }

    public final boolean b(e eVar) {
        l.e(eVar, "metadataVersionFromLanguageVersion");
        e eVar2 = this.f12887f ? f12885g : f12886h;
        int i7 = eVar2.f12855b;
        int i10 = eVar.f12855b;
        if (i7 > i10 || (i7 >= i10 && eVar2.f12856c > eVar.f12856c)) {
            eVar = eVar2;
        }
        int i11 = this.f12856c;
        boolean z10 = false;
        int i12 = this.f12855b;
        if ((i12 == 1 && i11 == 0) || i12 == 0) {
            return false;
        }
        int i13 = eVar.f12855b;
        if (i12 > i13 || (i12 >= i13 && i11 > eVar.f12856c)) {
            z10 = true;
        }
        return !z10;
    }
}
