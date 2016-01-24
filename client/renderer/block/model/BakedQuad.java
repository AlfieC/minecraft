package net.minecraft.client.renderer.block.model;

import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class BakedQuad
{
    protected final int[] vertexData;
    protected final int tintIndex;
    protected final EnumFacing face;

    public BakedQuad(int[] vertexDataIn, int tintIndexIn, EnumFacing faceIn)
    {
        this.vertexData = vertexDataIn;
        this.tintIndex = tintIndexIn;
        this.face = faceIn;
    }

    public int[] getVertexData()
    {
        return this.vertexData;
    }

    public boolean hasTintIndex()
    {
        return this.tintIndex != -1;
    }

    public int getTintIndex()
    {
        return this.tintIndex;
    }

    public EnumFacing getFace()
    {
        return this.face;
    }
}