// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ShareObject {
    private @Nullable Integer addedAt;
    private @Nullable String addedBy;
    /**
     * @return Description about the object.
     * 
     */
    private @Nullable String comment;
    /**
     * @return Type of the object, currently only `TABLE` is allowed.
     * 
     */
    private String dataObjectType;
    /**
     * @return Full name of the object, e.g. `catalog.schema.name` for a table.
     * 
     */
    private String name;
    private @Nullable String sharedAs;

    private ShareObject() {}
    public Optional<Integer> addedAt() {
        return Optional.ofNullable(this.addedAt);
    }
    public Optional<String> addedBy() {
        return Optional.ofNullable(this.addedBy);
    }
    /**
     * @return Description about the object.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return Type of the object, currently only `TABLE` is allowed.
     * 
     */
    public String dataObjectType() {
        return this.dataObjectType;
    }
    /**
     * @return Full name of the object, e.g. `catalog.schema.name` for a table.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> sharedAs() {
        return Optional.ofNullable(this.sharedAs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer addedAt;
        private @Nullable String addedBy;
        private @Nullable String comment;
        private String dataObjectType;
        private String name;
        private @Nullable String sharedAs;
        public Builder() {}
        public Builder(ShareObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addedAt = defaults.addedAt;
    	      this.addedBy = defaults.addedBy;
    	      this.comment = defaults.comment;
    	      this.dataObjectType = defaults.dataObjectType;
    	      this.name = defaults.name;
    	      this.sharedAs = defaults.sharedAs;
        }

        @CustomType.Setter
        public Builder addedAt(@Nullable Integer addedAt) {
            this.addedAt = addedAt;
            return this;
        }
        @CustomType.Setter
        public Builder addedBy(@Nullable String addedBy) {
            this.addedBy = addedBy;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder dataObjectType(String dataObjectType) {
            this.dataObjectType = Objects.requireNonNull(dataObjectType);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder sharedAs(@Nullable String sharedAs) {
            this.sharedAs = sharedAs;
            return this;
        }
        public ShareObject build() {
            final var o = new ShareObject();
            o.addedAt = addedAt;
            o.addedBy = addedBy;
            o.comment = comment;
            o.dataObjectType = dataObjectType;
            o.name = name;
            o.sharedAs = sharedAs;
            return o;
        }
    }
}
