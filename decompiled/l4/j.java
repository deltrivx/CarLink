package l4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f8003j = new Object();
    public static volatile j k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f8004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.g f8005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f8006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f8007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f8008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f8009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kb.d f8010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f8012i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f8004a = reentrantReadWriteLock;
        this.f8006c = 3;
        i iVar = sVar.f8038a;
        this.f8009f = iVar;
        int i7 = sVar.f8039b;
        this.f8011h = i7;
        this.f8012i = sVar.f8040c;
        this.f8007d = new Handler(Looper.getMainLooper());
        this.f8005b = new s.g(0);
        this.f8010g = new kb.d(25);
        f fVar = new f(this);
        this.f8008e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f8006c = 0;
            } catch (Throwable th) {
                this.f8004a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.K(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f8003j) {
            try {
                jVar = k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i7) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        k9.a.l(charSequence, "charSequence cannot be null");
        a2.b bVar = this.f8008e.f8001b;
        bVar.getClass();
        if (i7 < 0 || i7 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x[] xVarArr = (x[]) spanned.getSpans(i7, i7 + 1, x.class);
            if (xVarArr.length > 0) {
                return spanned.getSpanStart(xVarArr[0]);
            }
        }
        return ((p) bVar.S(charSequence, Math.max(0, i7 - 16), Math.min(charSequence.length(), i7 + 16), Integer.MAX_VALUE, true, new p(i7))).f8021b;
    }

    public final int c() {
        this.f8004a.readLock().lock();
        try {
            return this.f8006c;
        } finally {
            this.f8004a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f8011h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f8004a.writeLock().lock();
        try {
            if (this.f8006c == 0) {
                this.f8004a.writeLock().unlock();
                return;
            }
            this.f8006c = 0;
            this.f8004a.writeLock().unlock();
            f fVar = this.f8008e;
            j jVar = fVar.f8000a;
            try {
                jVar.f8009f.K(new e(fVar));
            } catch (Throwable th) {
                jVar.f(th);
            }
        } catch (Throwable th2) {
            this.f8004a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f8004a.writeLock().lock();
        try {
            this.f8006c = 2;
            arrayList.addAll(this.f8005b);
            this.f8005b.clear();
            this.f8004a.writeLock().unlock();
            this.f8007d.post(new b4.b(arrayList, this.f8006c, th));
        } catch (Throwable th2) {
            this.f8004a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    public final CharSequence g(int i7, int i10, int i11, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th;
        int i12;
        int i13;
        x[] xVarArr;
        int spanStart;
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i7 <= i10)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        z zVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i7 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i10 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i7 == i10) {
            return charSequence;
        }
        boolean z10 = i11 == 1;
        a2.b bVar = this.f8008e.f8001b;
        bVar.getClass();
        boolean z11 = charSequence instanceof v;
        if (z11) {
            ((v) charSequence).a();
        }
        if (z11) {
            zVar = new z((Spannable) charSequence);
            if (zVar != null) {
                for (x xVar : xVarArr) {
                    spanStart = zVar.f8057b.getSpanStart(xVar);
                    int spanEnd = zVar.f8057b.getSpanEnd(xVar);
                    if (spanStart != i10) {
                        zVar.removeSpan(xVar);
                    }
                    i7 = Math.min(spanStart, i7);
                    i10 = Math.max(spanEnd, i10);
                }
            }
            i12 = i7;
            i13 = i10;
            if (i12 != i13) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            }
            ((v) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    zVar = new z((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z11) {
                        throw th;
                    }
                    ((v) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i7 - 1, i10 + 1, x.class) <= i10) {
                zVar = new z();
                zVar.f8056a = false;
                zVar.f8057b = new SpannableString(charSequence);
            }
            if (zVar != null && (xVarArr = (x[]) zVar.f8057b.getSpans(i7, i10, x.class)) != null && xVarArr.length > 0) {
                while (i < r3) {
                    spanStart = zVar.f8057b.getSpanStart(xVar);
                    int spanEnd2 = zVar.f8057b.getSpanEnd(xVar);
                    if (spanStart != i10) {
                        zVar.removeSpan(xVar);
                    }
                    i7 = Math.min(spanStart, i7);
                    i10 = Math.max(spanEnd2, i10);
                }
            }
            i12 = i7;
            i13 = i10;
            if (i12 != i13 || i12 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    z zVar2 = (z) bVar.S(charSequence2, i12, i13, Integer.MAX_VALUE, z10, new u0.k(15, zVar, (kb.d) bVar.f12b));
                    if (zVar2 != null) {
                        Spannable spannable = zVar2.f8057b;
                        if (z11) {
                            ((v) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z11) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z11) {
                        throw th;
                    }
                    ((v) charSequence2).b();
                    throw th;
                }
            }
            ((v) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th;
        }
        ((v) charSequence2).b();
        throw th;
    }

    public final void h(h hVar) {
        k9.a.l(hVar, "initCallback cannot be null");
        this.f8004a.writeLock().lock();
        try {
            if (this.f8006c == 1 || this.f8006c == 2) {
                this.f8007d.post(new b4.b(Arrays.asList(hVar), this.f8006c, null));
            } else {
                this.f8005b.add(hVar);
            }
        } finally {
            this.f8004a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f8008e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        m4.b bVar = (m4.b) fVar.f8002c.f3847b;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f4320d).getInt(iA + bVar.f4317a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
