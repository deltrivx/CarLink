package com.baidu.carlife.protobuf;

import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.p;
import com.google.protobuf.s1;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class CarlifeMediaInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeMediaInfoProto$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[i0.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static final class CarlifeMediaInfo extends j0 implements CarlifeMediaInfoOrBuilder {
        public static final int ALBUMART_FIELD_NUMBER = 5;
        public static final int ALBUM_FIELD_NUMBER = 4;
        public static final int ARTIST_FIELD_NUMBER = 3;
        private static final CarlifeMediaInfo DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 6;
        public static final int MODE_FIELD_NUMBER = 9;
        private static volatile s1 PARSER = null;
        public static final int PLAYLISTNUM_FIELD_NUMBER = 7;
        public static final int SONGID_FIELD_NUMBER = 8;
        public static final int SONG_FIELD_NUMBER = 2;
        public static final int SOURCE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int duration_;
        private int mode_;
        private int playlistNum_;
        private byte memoizedIsInitialized = 2;
        private String source_ = "";
        private String song_ = "";
        private String artist_ = "";
        private String album_ = "";
        private l albumArt_ = l.f2785b;
        private String songId_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeMediaInfoOrBuilder {
            private Builder() {
                super(CarlifeMediaInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlbum() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearAlbum();
                return this;
            }

            public Builder clearAlbumArt() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearAlbumArt();
                return this;
            }

            public Builder clearArtist() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearArtist();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearDuration();
                return this;
            }

            public Builder clearMode() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearMode();
                return this;
            }

            public Builder clearPlaylistNum() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearPlaylistNum();
                return this;
            }

            public Builder clearSong() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearSong();
                return this;
            }

            public Builder clearSongId() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearSongId();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).clearSource();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public String getAlbum() {
                return ((CarlifeMediaInfo) this.instance).getAlbum();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public l getAlbumArt() {
                return ((CarlifeMediaInfo) this.instance).getAlbumArt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public l getAlbumBytes() {
                return ((CarlifeMediaInfo) this.instance).getAlbumBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public String getArtist() {
                return ((CarlifeMediaInfo) this.instance).getArtist();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public l getArtistBytes() {
                return ((CarlifeMediaInfo) this.instance).getArtistBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public int getDuration() {
                return ((CarlifeMediaInfo) this.instance).getDuration();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public int getMode() {
                return ((CarlifeMediaInfo) this.instance).getMode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public int getPlaylistNum() {
                return ((CarlifeMediaInfo) this.instance).getPlaylistNum();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public String getSong() {
                return ((CarlifeMediaInfo) this.instance).getSong();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public l getSongBytes() {
                return ((CarlifeMediaInfo) this.instance).getSongBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public String getSongId() {
                return ((CarlifeMediaInfo) this.instance).getSongId();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public l getSongIdBytes() {
                return ((CarlifeMediaInfo) this.instance).getSongIdBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public String getSource() {
                return ((CarlifeMediaInfo) this.instance).getSource();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public l getSourceBytes() {
                return ((CarlifeMediaInfo) this.instance).getSourceBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasAlbum() {
                return ((CarlifeMediaInfo) this.instance).hasAlbum();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasAlbumArt() {
                return ((CarlifeMediaInfo) this.instance).hasAlbumArt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasArtist() {
                return ((CarlifeMediaInfo) this.instance).hasArtist();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasDuration() {
                return ((CarlifeMediaInfo) this.instance).hasDuration();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasMode() {
                return ((CarlifeMediaInfo) this.instance).hasMode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasPlaylistNum() {
                return ((CarlifeMediaInfo) this.instance).hasPlaylistNum();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasSong() {
                return ((CarlifeMediaInfo) this.instance).hasSong();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasSongId() {
                return ((CarlifeMediaInfo) this.instance).hasSongId();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
            public boolean hasSource() {
                return ((CarlifeMediaInfo) this.instance).hasSource();
            }

            public Builder setAlbum(String str) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setAlbum(str);
                return this;
            }

            public Builder setAlbumArt(l lVar) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setAlbumArt(lVar);
                return this;
            }

            public Builder setAlbumBytes(l lVar) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setAlbumBytes(lVar);
                return this;
            }

            public Builder setArtist(String str) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setArtist(str);
                return this;
            }

            public Builder setArtistBytes(l lVar) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setArtistBytes(lVar);
                return this;
            }

            public Builder setDuration(int i7) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setDuration(i7);
                return this;
            }

            public Builder setMode(int i7) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setMode(i7);
                return this;
            }

            public Builder setPlaylistNum(int i7) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setPlaylistNum(i7);
                return this;
            }

            public Builder setSong(String str) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setSong(str);
                return this;
            }

            public Builder setSongBytes(l lVar) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setSongBytes(lVar);
                return this;
            }

            public Builder setSongId(String str) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setSongId(str);
                return this;
            }

            public Builder setSongIdBytes(l lVar) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setSongIdBytes(lVar);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(l lVar) {
                copyOnWrite();
                ((CarlifeMediaInfo) this.instance).setSourceBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeMediaInfo carlifeMediaInfo = new CarlifeMediaInfo();
            DEFAULT_INSTANCE = carlifeMediaInfo;
            j0.registerDefaultInstance(CarlifeMediaInfo.class, carlifeMediaInfo);
        }

        private CarlifeMediaInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbum() {
            this.bitField0_ &= -9;
            this.album_ = getDefaultInstance().getAlbum();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbumArt() {
            this.bitField0_ &= -17;
            this.albumArt_ = getDefaultInstance().getAlbumArt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArtist() {
            this.bitField0_ &= -5;
            this.artist_ = getDefaultInstance().getArtist();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.bitField0_ &= -33;
            this.duration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMode() {
            this.bitField0_ &= -257;
            this.mode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlaylistNum() {
            this.bitField0_ &= -65;
            this.playlistNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSong() {
            this.bitField0_ &= -3;
            this.song_ = getDefaultInstance().getSong();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongId() {
            this.bitField0_ &= -129;
            this.songId_ = getDefaultInstance().getSongId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.bitField0_ &= -2;
            this.source_ = getDefaultInstance().getSource();
        }

        public static CarlifeMediaInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeMediaInfo carlifeMediaInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeMediaInfo);
        }

        public static CarlifeMediaInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeMediaInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeMediaInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeMediaInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeMediaInfo parseFrom(l lVar) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeMediaInfo parseFrom(l lVar, y yVar) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeMediaInfo parseFrom(p pVar) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeMediaInfo parseFrom(p pVar, y yVar) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeMediaInfo parseFrom(InputStream inputStream) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeMediaInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeMediaInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeMediaInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeMediaInfo parseFrom(byte[] bArr) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeMediaInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeMediaInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbum(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.album_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumArt(l lVar) {
            lVar.getClass();
            this.bitField0_ |= 16;
            this.albumArt_ = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumBytes(l lVar) {
            this.album_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtist(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.artist_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtistBytes(l lVar) {
            this.artist_ = lVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(int i7) {
            this.bitField0_ |= 32;
            this.duration_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMode(int i7) {
            this.bitField0_ |= 256;
            this.mode_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaylistNum(int i7) {
            this.bitField0_ |= 64;
            this.playlistNum_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSong(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.song_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongBytes(l lVar) {
            this.song_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongId(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.songId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongIdBytes(l lVar) {
            this.songId_ = lVar.u();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(l lVar) {
            this.source_ = lVar.u();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.j0
        public final Object dynamicMethod(i0 i0Var, Object obj, Object obj2) {
            s1 f0Var;
            AnonymousClass1 anonymousClass1 = null;
            switch (i0Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case 2:
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔊ\u0004\u0006ᔄ\u0005\u0007ᔄ\u0006\bᔈ\u0007\tᔄ\b", new Object[]{"bitField0_", "source_", "song_", "artist_", "album_", "albumArt_", "duration_", "playlistNum_", "songId_", "mode_"});
                case 3:
                    return new CarlifeMediaInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeMediaInfo.class) {
                        try {
                            f0Var = PARSER;
                            if (f0Var == null) {
                                f0Var = new f0();
                                PARSER = f0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return f0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public String getAlbum() {
            return this.album_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public l getAlbumArt() {
            return this.albumArt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public l getAlbumBytes() {
            return l.m(this.album_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public String getArtist() {
            return this.artist_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public l getArtistBytes() {
            return l.m(this.artist_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public int getMode() {
            return this.mode_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public int getPlaylistNum() {
            return this.playlistNum_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public String getSong() {
            return this.song_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public l getSongBytes() {
            return l.m(this.song_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public String getSongId() {
            return this.songId_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public l getSongIdBytes() {
            return l.m(this.songId_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public l getSourceBytes() {
            return l.m(this.source_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasAlbum() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasAlbumArt() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasArtist() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasDuration() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasPlaylistNum() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasSong() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasSongId() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeMediaInfoOrBuilder extends m1 {
        String getAlbum();

        l getAlbumArt();

        l getAlbumBytes();

        String getArtist();

        l getArtistBytes();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getDuration();

        int getMode();

        int getPlaylistNum();

        String getSong();

        l getSongBytes();

        String getSongId();

        l getSongIdBytes();

        String getSource();

        l getSourceBytes();

        boolean hasAlbum();

        boolean hasAlbumArt();

        boolean hasArtist();

        boolean hasDuration();

        boolean hasMode();

        boolean hasPlaylistNum();

        boolean hasSong();

        boolean hasSongId();

        boolean hasSource();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeMediaInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}
