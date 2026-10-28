package zb;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f15804a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        i9.l.d(charsetForName, "forName(...)");
        f15804a = charsetForName;
        i9.l.d(Charset.forName("UTF-16"), "forName(...)");
        i9.l.d(Charset.forName("UTF-16BE"), "forName(...)");
        i9.l.d(Charset.forName("UTF-16LE"), "forName(...)");
        i9.l.d(Charset.forName("US-ASCII"), "forName(...)");
        i9.l.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
