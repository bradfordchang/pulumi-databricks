// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetShareObjectPartitionValue extends com.pulumi.resources.InvokeArgs {

    public static final GetShareObjectPartitionValue Empty = new GetShareObjectPartitionValue();

    /**
     * The name of the share
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the share
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="op", required=true)
    private String op;

    public String op() {
        return this.op;
    }

    @Import(name="recipientPropertyKey")
    private @Nullable String recipientPropertyKey;

    public Optional<String> recipientPropertyKey() {
        return Optional.ofNullable(this.recipientPropertyKey);
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetShareObjectPartitionValue() {}

    private GetShareObjectPartitionValue(GetShareObjectPartitionValue $) {
        this.name = $.name;
        this.op = $.op;
        this.recipientPropertyKey = $.recipientPropertyKey;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShareObjectPartitionValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShareObjectPartitionValue $;

        public Builder() {
            $ = new GetShareObjectPartitionValue();
        }

        public Builder(GetShareObjectPartitionValue defaults) {
            $ = new GetShareObjectPartitionValue(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the share
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder op(String op) {
            $.op = op;
            return this;
        }

        public Builder recipientPropertyKey(@Nullable String recipientPropertyKey) {
            $.recipientPropertyKey = recipientPropertyKey;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetShareObjectPartitionValue build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.op = Objects.requireNonNull($.op, "expected parameter 'op' to be non-null");
            return $;
        }
    }

}
