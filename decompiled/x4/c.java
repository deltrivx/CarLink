package x4;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14590c;

    public c(String str, int i7, int i10) {
        this.f14588a = str;
        this.f14589b = i7;
        this.f14590c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i7 = cVar.f14590c;
        String str = cVar.f14588a;
        int i10 = cVar.f14589b;
        int i11 = this.f14590c;
        String str2 = this.f14588a;
        int i12 = this.f14589b;
        if (i12 < 0 || i10 < 0) {
            return TextUtils.equals(str2, str) && i11 == i7;
        }
        return TextUtils.equals(str2, str) && i12 == i10 && i11 == i7;
    }

    public final int hashCode() {
        return Objects.hash(this.f14588a, Integer.valueOf(this.f14590c));
    }
}
