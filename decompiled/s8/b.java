package s8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f12596e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f12597f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f12598g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12602d;

    public b(String str) {
        this.f12599a = str;
        if (str != null) {
            Matcher matcher = f12596e.matcher(str);
            this.f12600b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f12597f.matcher(str);
            this.f12601c = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.f12600b = "";
            this.f12601c = "UTF-8";
        }
        if (!"multipart/form-data".equalsIgnoreCase(this.f12600b)) {
            this.f12602d = null;
        } else {
            Matcher matcher3 = f12598g.matcher(str);
            this.f12602d = matcher3.find() ? matcher3.group(2) : null;
        }
    }

    public final String a() {
        String str = this.f12601c;
        return str == null ? "US-ASCII" : str;
    }
}
