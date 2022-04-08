using System.Drawing;

namespace Test.Operators
{
    internal class InnerText
    {
        public float X { get; }

        public float Y { get; }

        public float Height { get; }

        public float Width { get; }

        public PDFont Font { get; }

        public float FontSizeInPt { get; }

        public string Text { get; }

        public Color FillColor { get; }

        public InnerText(float x, float y,
            float width,
            float height,
            string text,
            PD font,
            float fontSizeInPt, Color fillColor)
        {
            X = x;
            Y = y;
            Height = height;
            Width = width;
            Text = text;
            Font = font;
            FontSizeInPt = fontSizeInPt;
            FillColor = fillColor;
        }
    }
}