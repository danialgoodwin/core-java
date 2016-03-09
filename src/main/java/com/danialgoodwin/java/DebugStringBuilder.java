/**
 * Created by Danial Goodwin on 2016-03-09.
 */
package com.danialgoodwin.java;

/** Format text for debug information. */
public abstract class DebugStringBuilder {

    protected StringBuilder mDebugStringBuilder = new StringBuilder();

    private DebugStringBuilder(CharSequence title) {
        mDebugStringBuilder.append(title);
    }

    /** Return new instance of this class.
     * @param title The top label for this debug string
     * @param isCondensed set true to not include newlines, set false to include newlines
     */
    public static DebugStringBuilder newInstance(CharSequence title, boolean isCondensed) {
        if (isCondensed) {
            return new CondensedDebugStringBuilder(title);
        } else {
            return new DefaultDebugStringBuilder(title);
        }
    }

    public abstract DebugStringBuilder add(CharSequence label, boolean value);
    public abstract DebugStringBuilder add(CharSequence label, int value);
    public abstract DebugStringBuilder add(CharSequence label, float value);
    public abstract DebugStringBuilder add(CharSequence label, CharSequence value);

    /** Note: This does NOT add any newlines. */
    public DebugStringBuilder add(CharSequence label) {
        mDebugStringBuilder.append(label);
        return this;
    }

    public DebugStringBuilder addNewLine(CharSequence label) {
        mDebugStringBuilder.append("\n").append(label);
        return this;
    }

    @Override
    public String toString() {
        return mDebugStringBuilder.toString();
    }

    private static class CondensedDebugStringBuilder extends DebugStringBuilder {

        private CondensedDebugStringBuilder(CharSequence title) {
            super(title);
        }

        @Override
        public DebugStringBuilder add(CharSequence label, boolean value) {
            mDebugStringBuilder.append(",").append(label).append("=").append(value);
            return this;
        }

        @Override
        public DebugStringBuilder add(CharSequence label, int value) {
            mDebugStringBuilder.append(",").append(label).append("=").append(value);
            return this;
        }

        @Override
        public DebugStringBuilder add(CharSequence label, float value) {
            mDebugStringBuilder.append(",").append(label).append("=").append(value);
            return this;
        }

        @Override
        public DebugStringBuilder add(CharSequence label, CharSequence value) {
            mDebugStringBuilder.append(",").append(label).append("=").append(value);
            return this;
        }

    }

    private static class DefaultDebugStringBuilder extends DebugStringBuilder {

        private DefaultDebugStringBuilder(CharSequence title) {
            super(title);
            mDebugStringBuilder.append(":");
        }

        @Override
        public DebugStringBuilder add(CharSequence label, boolean value) {
            mDebugStringBuilder.append("\n").append(label).append(": ").append(value);
            return this;
        }

        @Override
        public DebugStringBuilder add(CharSequence label, int value) {
            mDebugStringBuilder.append("\n").append(label).append(": ").append(value);
            return this;
        }

        @Override
        public DebugStringBuilder add(CharSequence label, float value) {
            mDebugStringBuilder.append("\n").append(label).append(": ").append(value);
            return this;
        }

        @Override
        public DebugStringBuilder add(CharSequence label, CharSequence value) {
            mDebugStringBuilder.append("\n").append(label).append(": ").append(value);
            return null;
        }

    }

}
