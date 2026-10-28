package y2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14983a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f14983a == ((g) obj).f14983a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14983a;
    }

    public final String toString() {
        int i7 = this.f14983a;
        if (i7 == 0) {
            return "Button";
        }
        if (i7 == 1) {
            return "Checkbox";
        }
        if (i7 == 2) {
            return "Switch";
        }
        if (i7 == 3) {
            return "RadioButton";
        }
        if (i7 == 4) {
            return "Tab";
        }
        if (i7 == 5) {
            return "Image";
        }
        if (i7 == 6) {
            return "DropdownList";
        }
        if (i7 == 7) {
            return "Picker";
        }
        return i7 == 8 ? "Carousel" : "Unknown";
    }
}
