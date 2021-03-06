package net.minecraft.server.v1_7_R4;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.MathHelper;

public class NBTTagDouble extends NBTBase.NBTPrimitive
{
    private double data;
    private static final String __OBFID = "CL_00001218";

    NBTTagDouble() {}

    public NBTTagDouble(double p_i45130_1_)
    {
        this.data = p_i45130_1_;
    }

    void write(DataOutput output) throws IOException
    {
        output.writeDouble(this.data);
    }

    void load(DataInput input, int depth, NBTReadLimiter sizeTracker) throws IOException
    {
        sizeTracker.a(64L);
        this.data = input.readDouble();
    }

    public byte getTypeId()
    {
        return (byte)6;
    }

    public String toString()
    {
        return "" + this.data + "d";
    }

    public NBTBase clone()
    {
        return new NBTTagDouble(this.data);
    }

    public boolean equals(Object p_equals_1_)
    {
        if (super.equals(p_equals_1_))
        {
            NBTTagDouble nbttagdouble = (NBTTagDouble)p_equals_1_;
            return this.data == nbttagdouble.data;
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        long i = Double.doubleToLongBits(this.data);
        return super.hashCode() ^ (int)(i ^ i >>> 32);
    }

    public long getLong()
    {
        return (long)Math.floor(this.data);
    }

    public int getInt()
    {
        return MathHelper.floor_double(this.data);
    }

    public short getShort()
    {
        return (short)(MathHelper.floor_double(this.data) & 65535);
    }

    public byte getByte()
    {
        return (byte)(MathHelper.floor_double(this.data) & 255);
    }

    public double getDouble()
    {
        return this.data;
    }

    public float getFloat()
    {
        return (float)this.data;
    }
}
