package k7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.r;
import android.support.v4.media.session.s;
import android.support.v4.media.session.u;
import android.util.Log;
import androidx.lifecycle.z;
import com.baidu.carlife.protobuf.CarlifeMediaInfoProto;
import com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.google.protobuf.j0;
import com.google.protobuf.u0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import n8.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements TransportListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f7351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CarlifeMediaProgressBarProto.CarlifeMediaProgressBar f7352b;

    public final void a(boolean z10, Long l10) {
        CarlifeMediaProgressBarProto.CarlifeMediaProgressBar carlifeMediaProgressBar = this.f7352b;
        if (carlifeMediaProgressBar != null) {
            int i7 = z10 ? 3 : 2;
            ArrayList arrayList = new ArrayList();
            long jLongValue = l10 != null ? l10.longValue() : carlifeMediaProgressBar.getProgressBar();
            float f10 = i7 == 3 ? 1.0f : 0.0f;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            r rVar = this.f7351a;
            if (rVar != null) {
                PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(i7, jLongValue, 0L, f10, 54L, 0, null, jElapsedRealtime, arrayList, -1L, null);
                android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) rVar.f604b;
                mVar.f597f = playbackStateCompat;
                synchronized (mVar.f595d) {
                    for (int iBeginBroadcast = mVar.f596e.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.b) mVar.f596e.getBroadcastItem(iBeginBroadcast)).T(playbackStateCompat);
                        } catch (RemoteException unused) {
                        }
                    }
                    mVar.f596e.finishBroadcast();
                }
                MediaSession mediaSession = mVar.f592a;
                if (playbackStateCompat.f570l == null) {
                    PlaybackState.Builder builderD = s.d();
                    s.x(builderD, playbackStateCompat.f560a, playbackStateCompat.f561b, playbackStateCompat.f563d, playbackStateCompat.f567h);
                    s.u(builderD, playbackStateCompat.f562c);
                    s.s(builderD, playbackStateCompat.f564e);
                    s.v(builderD, playbackStateCompat.f566g);
                    for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f568i) {
                        PlaybackState.CustomAction.Builder builderE = s.e(customAction.f571a, customAction.f572b, customAction.f573c);
                        s.w(builderE, customAction.f574d);
                        s.a(builderD, s.b(builderE));
                    }
                    s.t(builderD, playbackStateCompat.f569j);
                    if (Build.VERSION.SDK_INT >= 22) {
                        u.b(builderD, playbackStateCompat.k);
                    }
                    playbackStateCompat.f570l = s.c(builderD);
                }
                mediaSession.setPlaybackState(playbackStateCompat.f570l);
            }
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAttached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.a(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionDetached(CarLifeContext carLifeContext) {
        i9.l.e(carLifeContext, "context");
        a(false, null);
        r rVar = this.f7351a;
        if (rVar != null) {
            android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) rVar.f604b;
            rVar.J(null, null);
            mVar.f592a.setActive(false);
            Iterator it = ((ArrayList) rVar.f605c).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            MediaSession mediaSession = mVar.f592a;
            mVar.f596e.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(mediaSession);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e7) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                }
            }
            mediaSession.setCallback(null);
            mVar.f593b.f591b.set(null);
            mediaSession.release();
        }
        this.f7351a = null;
        this.f7352b = null;
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionEstablished(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.d(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        com.baidu.carlife.sdk.a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        com.baidu.carlife.sdk.a.h(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        byte[] bArr;
        i9.l.e(carLifeContext, "context");
        i9.l.e(carLifeMessage, "message");
        if (n3.l.J(3, 1).contains(Integer.valueOf(carLifeMessage.getChannel()))) {
            Bitmap bitmapDecodeByteArray = null;
            switch (carLifeMessage.getServiceType()) {
                case ServiceTypes.MSG_CMD_MEDIA_INFO /* 65589 */:
                    j0 j0VarA = t.a(carLifeMessage);
                    if (j0VarA != null) {
                        CarlifeMediaInfoProto.CarlifeMediaInfo carlifeMediaInfo = (CarlifeMediaInfoProto.CarlifeMediaInfo) j0VarA;
                        a2.d dVar = new a2.d(1);
                        String song = carlifeMediaInfo.getSong();
                        if (song == null) {
                            song = "未知歌名";
                        }
                        dVar.w("android.media.metadata.TITLE", song);
                        String artist = carlifeMediaInfo.getArtist();
                        if (artist == null) {
                            artist = "未知歌手";
                        }
                        dVar.w("android.media.metadata.ARTIST", artist);
                        dVar.w("android.media.metadata.MEDIA_ID", carlifeMediaInfo.getSongId());
                        dVar.w("android.media.metadata.ALBUM", carlifeMediaInfo.getAlbum());
                        dVar.v("android.media.metadata.NUM_TRACKS", carlifeMediaInfo.getPlaylistNum());
                        int duration = carlifeMediaInfo.getDuration();
                        Integer numValueOf = Integer.valueOf(duration);
                        if (duration < 10000) {
                            numValueOf = null;
                        }
                        dVar.v("android.media.metadata.DURATION", numValueOf != null ? numValueOf.intValue() : ((long) carlifeMediaInfo.getDuration()) * 1000);
                        com.google.protobuf.l albumArt = carlifeMediaInfo.getAlbumArt();
                        if (albumArt != null) {
                            if (albumArt.size() == 0) {
                                albumArt = null;
                            }
                            if (albumArt != null) {
                                int size = albumArt.size();
                                if (size == 0) {
                                    bArr = u0.f2862b;
                                } else {
                                    byte[] bArr2 = new byte[size];
                                    albumArt.n(bArr2, size);
                                    bArr = bArr2;
                                }
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, albumArt.size());
                            }
                            if (bitmapDecodeByteArray != null) {
                                s.f fVar = MediaMetadataCompat.f542c;
                                if (fVar.containsKey("android.media.metadata.ALBUM_ART") && ((Integer) fVar.get("android.media.metadata.ALBUM_ART")).intValue() != 2) {
                                    throw new IllegalArgumentException(a2.f.G("The ", "android.media.metadata.ALBUM_ART", " key cannot be used to put a Bitmap"));
                                }
                                ((Bundle) dVar.f20b).putParcelable("android.media.metadata.ALBUM_ART", bitmapDecodeByteArray);
                            }
                        }
                        r rVar = this.f7351a;
                        if (rVar != null) {
                            MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat((Bundle) dVar.f20b);
                            android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) rVar.f604b;
                            mVar.f598g = mediaMetadataCompat;
                            MediaSession mediaSession = mVar.f592a;
                            if (mediaMetadataCompat.f544b == null) {
                                MediaMetadata.Builder builder = new MediaMetadata.Builder();
                                Bundle bundle = mediaMetadataCompat.f543a;
                                for (String str : bundle.keySet()) {
                                    Integer num = (Integer) MediaMetadataCompat.f542c.get(str);
                                    if (num == null) {
                                        num = -1;
                                    }
                                    int iIntValue = num.intValue();
                                    if (iIntValue == 0) {
                                        builder.putLong(str, bundle.getLong(str, 0L));
                                    } else if (iIntValue == 1) {
                                        builder.putText(str, bundle.getCharSequence(str));
                                    } else if (iIntValue == 2) {
                                        builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                                    } else if (iIntValue != 3) {
                                        Object obj = bundle.get(str);
                                        if (obj == null || (obj instanceof CharSequence)) {
                                            builder.putText(str, (CharSequence) obj);
                                        } else if (obj instanceof Long) {
                                            builder.putLong(str, ((Long) obj).longValue());
                                        } else if (obj instanceof Bitmap) {
                                            builder.putBitmap(str, (Bitmap) obj);
                                        } else if (obj instanceof Rating) {
                                            builder.putRating(str, (Rating) obj);
                                        }
                                    } else {
                                        builder.putRating(str, (Rating) bundle.getParcelable(str));
                                    }
                                }
                                mediaMetadataCompat.f544b = builder.build();
                            }
                            mediaSession.setMetadata(mediaMetadataCompat.f544b);
                        }
                    }
                    break;
                case ServiceTypes.MSG_CMD_MEDIA_PROGRESS_BAR /* 65590 */:
                    j0 j0VarA2 = t.a(carLifeMessage);
                    if (j0VarA2 != null) {
                        this.f7352b = (CarlifeMediaProgressBarProto.CarlifeMediaProgressBar) j0VarA2;
                        a(true, null);
                        return false;
                    }
                    break;
                case ServiceTypes.MSG_MEDIA_INIT /* 196609 */:
                    if (this.f7351a == null) {
                        r rVar2 = new r(n8.a.b());
                        android.support.v4.media.session.m mVar2 = (android.support.v4.media.session.m) rVar2.f604b;
                        mVar2.f592a.setMediaButtonReceiver(null);
                        mVar2.f592a.setActive(true);
                        Iterator it = ((ArrayList) rVar2.f605c).iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                        this.f7351a = rVar2;
                        new Handler(Looper.getMainLooper()).post(new z(14, this));
                        return false;
                    }
                    break;
                case ServiceTypes.MSG_MEDIA_PAUSE /* 196611 */:
                    a(false, null);
                    return false;
            }
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
