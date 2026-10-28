package zb;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f15828a;

    public i(String str) {
        Pattern patternCompile = Pattern.compile(str);
        i9.l.d(patternCompile, "compile(...)");
        this.f15828a = patternCompile;
    }

    public final boolean a(String str) {
        i9.l.e(str, "input");
        return this.f15828a.matcher(str).matches();
    }

    public final String toString() {
        String string = this.f15828a.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
