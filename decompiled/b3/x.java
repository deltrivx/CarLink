package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f1464b = new x(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1465a;

    public x() {
        this.f1465a = false;
    }

    public x(boolean z10) {
        this.f1465a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f1465a == ((x) obj).f1465a;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1465a ? 1231 : 1237) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f1465a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }
}
