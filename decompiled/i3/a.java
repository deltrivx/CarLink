package i3;

import i9.l;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f6612a;

    public a(Locale locale) {
        this.f6612a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.a(this.f6612a.toLanguageTag(), ((a) obj).f6612a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f6612a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f6612a.toLanguageTag();
    }
}
