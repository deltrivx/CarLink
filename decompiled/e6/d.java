package e6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends f {
    public final void p(StringBuilder sb2, int i7) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        q(sb2, i7, length);
    }

    public final void q(StringBuilder sb2, int i7, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            int iX = a2.b.x((i11 * 10) + i7, 10, (t5.a) ((a2.b) this.f4440b).f12b);
            if (iX / 100 == 0) {
                sb2.append('0');
            }
            if (iX / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(iX);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int iCharAt = sb2.charAt(i13 + i10) - '0';
            if ((i13 & 1) == 0) {
                iCharAt *= 3;
            }
            i12 += iCharAt;
        }
        int i14 = 10 - (i12 % 10);
        sb2.append(i14 != 10 ? i14 : 0);
    }
}
