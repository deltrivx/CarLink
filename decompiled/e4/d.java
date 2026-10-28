package e4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Cloneable f4331f;

    public /* synthetic */ d(int i7) {
        this.f4326a = i7;
    }

    public d(d dVar) {
        this.f4326a = 1;
        ClipData clipData = (ClipData) dVar.f4327b;
        clipData.getClass();
        this.f4327b = clipData;
        int i7 = dVar.f4328c;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i7 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f4328c = i7;
        int i10 = dVar.f4329d;
        if ((i10 & 1) == i10) {
            this.f4329d = i10;
            this.f4330e = (Uri) dVar.f4330e;
            this.f4331f = (Bundle) dVar.f4331f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // e4.e
    public int a() {
        return this.f4329d;
    }

    @Override // e4.e
    public ClipData b() {
        return (ClipData) this.f4327b;
    }

    @Override // e4.c
    public f build() {
        return new f(new d(this));
    }

    @Override // e4.c
    public void c(Uri uri) {
        this.f4330e = uri;
    }

    @Override // e4.c
    public void d(int i7) {
        this.f4329d = i7;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.lang.Cloneable] */
    public int e(long j5) {
        int i7 = this.f4328c + 1;
        long[] jArr = (long[]) this.f4327b;
        int length = jArr.length;
        if (i7 > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            int[] iArr = new int[i10];
            u8.l.o0(jArr, jArr2, 0, 0, jArr.length);
            u8.l.q0(0, 0, 14, (int[]) this.f4330e, iArr);
            this.f4327b = jArr2;
            this.f4330e = iArr;
        }
        int i11 = this.f4328c;
        this.f4328c = i11 + 1;
        int length2 = ((int[]) this.f4331f).length;
        if (this.f4329d >= length2) {
            int i12 = length2 * 2;
            ?? r8 = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                r8[i13] = i14;
                i13 = i14;
            }
            u8.l.q0(0, 0, 14, (int[]) this.f4331f, r8);
            this.f4331f = r8;
        }
        int i15 = this.f4329d;
        int[] iArr2 = (int[]) this.f4331f;
        this.f4329d = iArr2[i15];
        long[] jArr3 = (long[]) this.f4327b;
        jArr3[i11] = j5;
        ((int[]) this.f4330e)[i11] = i15;
        iArr2[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (i9.l.g(jArr3[i16], j5) <= 0) {
                break;
            }
            f(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    public void f(int i7, int i10) {
        long[] jArr = (long[]) this.f4327b;
        int[] iArr = (int[]) this.f4330e;
        int[] iArr2 = (int[]) this.f4331f;
        long j5 = jArr[i7];
        jArr[i7] = jArr[i10];
        jArr[i10] = j5;
        int i11 = iArr[i7];
        int i12 = iArr[i10];
        iArr[i7] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i7;
        iArr2[i11] = i10;
    }

    @Override // e4.e
    public int getSource() {
        return this.f4328c;
    }

    @Override // e4.e
    public ContentInfo h() {
        return null;
    }

    @Override // e4.c
    public void setExtras(Bundle bundle) {
        this.f4331f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f4326a) {
            case 1:
                Uri uri = (Uri) this.f4330e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(((ClipData) this.f4327b).getDescription());
                sb2.append(", source=");
                int i7 = this.f4328c;
                if (i7 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i7 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i7 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i7 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i7 != 4) {
                    strValueOf = i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i10 = this.f4329d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return ob.a.s(sb2, ((Bundle) this.f4331f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }
}
