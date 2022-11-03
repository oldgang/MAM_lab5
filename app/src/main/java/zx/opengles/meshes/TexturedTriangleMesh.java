package zx.opengles.meshes;

/**
 @author Marek Kulawiak
 */

// Klasa reprezentująca oteksturowaną piramidę.
public class TexturedTriangleMesh extends BaseMesh
{
    public TexturedTriangleMesh()
    {
        final float[] positionData = {
            // Przednia ściana
            -1f, -1f, 1f,
            1f, -1f, 1f,
            0f, 0f, 0f,

            // Prawa ściana
            1f, -1f, 1f,
            1f, -1f, -1f,
            0f, 0f, 0f,

            // Tylna ściana
            1f, -1f, -1f,
            -1f, -1f, -1f,
            0f, 0f, 0f,

            // Lewa ściana
            -1f, -1f, -1f,
            -1f, -1f, 1f,
            0f, 0f, 0f,

            // Dolna ściana
            1.0f, -1.0f, -1.0f,
            1.0f, -1.0f, 1.0f,
            -1.0f, -1.0f, -1.0f,
            1.0f, -1.0f, 1.0f,
            -1.0f, -1.0f, 1.0f,
            -1.0f, -1.0f, -1.0f
        };

        // Współrzędne tekstury są takie same dla wszystkich ścian.
        final float[] texCoordData = {
            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f,

            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f,

            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f,

            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f,

            0.0f, 0.0f,
            0.0f, 1.0f,
            1.0f, 0.0f,
            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f
        };

        final float[] normalData = {
            // Przednia ściana
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,

            // Prawa ściana
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,

            // Tylna ściana
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,

            // Lewa ściana
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,

            // Dolna ściana
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f
        };

        numberOfVertices = 18;

        positionBuffer = createBuffer(positionData);
        texCoordsBuffer = createBuffer(texCoordData);
        normalBuffer = createBuffer(normalData);
    }
}
