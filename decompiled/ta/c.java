package ta;

import g1.j0;
import xa.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f12859d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i7, o[] oVarArr) {
        if (oVarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i10 = 1;
        int length = oVarArr.length - 1;
        if (length != 0) {
            for (int i11 = 31; i11 >= 0; i11--) {
                if (((1 << i11) & length) != 0) {
                    i10 = 1 + i11;
                }
            }
            throw new IllegalStateException("Empty enum: " + oVarArr.getClass());
        }
        super(i7, i10, 2, (byte) 0);
        this.f12859d = oVarArr;
    }

    public final Object i(int i7) {
        int i10 = (1 << this.f5793c) - 1;
        int i11 = this.f5792b;
        int i12 = (i7 & (i10 << i11)) >> i11;
        for (o oVar : this.f12859d) {
            if (oVar.getNumber() == i12) {
                return oVar;
            }
        }
        return null;
    }
}
