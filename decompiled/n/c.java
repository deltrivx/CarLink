package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f8642f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f8644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f8645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f8646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f8647e;

    public c(Context context, int i7) {
        super(context);
        this.f8643a = i7;
    }

    public final void a(Configuration configuration) {
        if (this.f8647e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f8646d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f8646d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f8644b == null) {
            this.f8644b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8644b.setTo(theme);
            }
        }
        this.f8644b.applyStyle(this.f8643a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f8647e == null) {
            Configuration configuration = this.f8646d;
            if (configuration == null) {
                this.f8647e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f8642f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f8642f = configuration2;
                    }
                    if (configuration.equals(f8642f)) {
                        this.f8647e = super.getResources();
                    }
                }
                this.f8647e = createConfigurationContext(this.f8646d).getResources();
            }
        }
        return this.f8647e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8645c == null) {
            this.f8645c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8645c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f8644b;
        if (theme != null) {
            return theme;
        }
        if (this.f8643a == 0) {
            this.f8643a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f8644b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        if (this.f8643a != i7) {
            this.f8643a = i7;
            b();
        }
    }
}
