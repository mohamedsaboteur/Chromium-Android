
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/media_types.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class VideoFrameData extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int EosData = 0;
        public static final int SharedBufferData = 1;
        public static final int MailboxData = 2;
    };

    private int mTag_ = -1;
    private EosVideoFrameData mEosData;
    private SharedBufferVideoFrameData mSharedBufferData;
    private MailboxVideoFrameData mMailboxData;

    public int which() {
      return mTag_;
    }

    public boolean isUnknown() {
      return mTag_ == -1;
    }

    public void setEosData(EosVideoFrameData eosData) {
        this.mTag_ = Tag.EosData;
        this.mEosData = eosData;
    }

    public EosVideoFrameData getEosData() {
        assert this.mTag_ == Tag.EosData;
        return this.mEosData;
    }

    public void setSharedBufferData(SharedBufferVideoFrameData sharedBufferData) {
        this.mTag_ = Tag.SharedBufferData;
        this.mSharedBufferData = sharedBufferData;
    }

    public SharedBufferVideoFrameData getSharedBufferData() {
        assert this.mTag_ == Tag.SharedBufferData;
        return this.mSharedBufferData;
    }

    public void setMailboxData(MailboxVideoFrameData mailboxData) {
        this.mTag_ = Tag.MailboxData;
        this.mMailboxData = mailboxData;
    }

    public MailboxVideoFrameData getMailboxData() {
        assert this.mTag_ == Tag.MailboxData;
        return this.mMailboxData;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag_, offset + 4);
        switch (mTag_) {
            case Tag.EosData: {
                
                encoder0.encode(this.mEosData, offset + 8, false);
                break;
            }
            case Tag.SharedBufferData: {
                
                encoder0.encode(this.mSharedBufferData, offset + 8, false);
                break;
            }
            case Tag.MailboxData: {
                
                encoder0.encode(this.mMailboxData, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static VideoFrameData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final VideoFrameData decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        VideoFrameData result = new VideoFrameData();
        switch (dataHeader.elementsOrVersion) {
            case Tag.EosData: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mEosData = EosVideoFrameData.decode(decoder1);
                result.mTag_ = Tag.EosData;
                break;
            }
            case Tag.SharedBufferData: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSharedBufferData = SharedBufferVideoFrameData.decode(decoder1);
                result.mTag_ = Tag.SharedBufferData;
                break;
            }
            case Tag.MailboxData: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mMailboxData = MailboxVideoFrameData.decode(decoder1);
                result.mTag_ = Tag.MailboxData;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        VideoFrameData other = (VideoFrameData) object;
        if (this.mTag_ != other.mTag_)
            return false;
        switch (this.mTag_) {
            case Tag.EosData:
                return org.chromium.mojo.bindings.BindingsHelper.equals(this.mEosData, other.mEosData);
            case Tag.SharedBufferData:
                return org.chromium.mojo.bindings.BindingsHelper.equals(this.mSharedBufferData, other.mSharedBufferData);
            case Tag.MailboxData:
                return org.chromium.mojo.bindings.BindingsHelper.equals(this.mMailboxData, other.mMailboxData);
            default:
                break;
        }
        return false;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(mTag_);
        switch (this.mTag_) {
            case Tag.EosData: {
                result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.mEosData);
                break;
            }
            case Tag.SharedBufferData: {
                result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.mSharedBufferData);
                break;
            }
            case Tag.MailboxData: {
                result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.mMailboxData);
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}