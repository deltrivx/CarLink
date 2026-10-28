package f2;

import a2.d;
import a2.f;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import i9.l;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f5240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5241b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5242c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f5240a = xmlResourceParser;
        d dVar = new d(4, false);
        dVar.f20b = new float[64];
        this.f5242c = dVar;
    }

    public final float a(TypedArray typedArray, String str, int i7, float f10) {
        if (w3.b.d(this.f5240a, str)) {
            f10 = typedArray.getFloat(i7, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i7) {
        this.f5241b = i7 | this.f5241b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f5240a, aVar.f5240a) && this.f5241b == aVar.f5241b;
    }

    public final int hashCode() {
        return (this.f5240a.hashCode() * 31) + this.f5241b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f5240a);
        sb2.append(", config=");
        return f.H(sb2, this.f5241b, ')');
    }
}
