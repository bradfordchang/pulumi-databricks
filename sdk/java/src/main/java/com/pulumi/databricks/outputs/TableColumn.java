// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableColumn {
    private @Nullable String comment;
    private String name;
    private @Nullable Boolean nullable;
    private @Nullable Integer partitionIndex;
    private Integer position;
    private @Nullable String typeIntervalType;
    private @Nullable String typeJson;
    private String typeName;
    private @Nullable Integer typePrecision;
    private @Nullable Integer typeScale;
    private String typeText;

    private TableColumn() {}
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public String name() {
        return this.name;
    }
    public Optional<Boolean> nullable() {
        return Optional.ofNullable(this.nullable);
    }
    public Optional<Integer> partitionIndex() {
        return Optional.ofNullable(this.partitionIndex);
    }
    public Integer position() {
        return this.position;
    }
    public Optional<String> typeIntervalType() {
        return Optional.ofNullable(this.typeIntervalType);
    }
    public Optional<String> typeJson() {
        return Optional.ofNullable(this.typeJson);
    }
    public String typeName() {
        return this.typeName;
    }
    public Optional<Integer> typePrecision() {
        return Optional.ofNullable(this.typePrecision);
    }
    public Optional<Integer> typeScale() {
        return Optional.ofNullable(this.typeScale);
    }
    public String typeText() {
        return this.typeText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private String name;
        private @Nullable Boolean nullable;
        private @Nullable Integer partitionIndex;
        private Integer position;
        private @Nullable String typeIntervalType;
        private @Nullable String typeJson;
        private String typeName;
        private @Nullable Integer typePrecision;
        private @Nullable Integer typeScale;
        private String typeText;
        public Builder() {}
        public Builder(TableColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.nullable = defaults.nullable;
    	      this.partitionIndex = defaults.partitionIndex;
    	      this.position = defaults.position;
    	      this.typeIntervalType = defaults.typeIntervalType;
    	      this.typeJson = defaults.typeJson;
    	      this.typeName = defaults.typeName;
    	      this.typePrecision = defaults.typePrecision;
    	      this.typeScale = defaults.typeScale;
    	      this.typeText = defaults.typeText;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nullable(@Nullable Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        @CustomType.Setter
        public Builder partitionIndex(@Nullable Integer partitionIndex) {
            this.partitionIndex = partitionIndex;
            return this;
        }
        @CustomType.Setter
        public Builder position(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        @CustomType.Setter
        public Builder typeIntervalType(@Nullable String typeIntervalType) {
            this.typeIntervalType = typeIntervalType;
            return this;
        }
        @CustomType.Setter
        public Builder typeJson(@Nullable String typeJson) {
            this.typeJson = typeJson;
            return this;
        }
        @CustomType.Setter
        public Builder typeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }
        @CustomType.Setter
        public Builder typePrecision(@Nullable Integer typePrecision) {
            this.typePrecision = typePrecision;
            return this;
        }
        @CustomType.Setter
        public Builder typeScale(@Nullable Integer typeScale) {
            this.typeScale = typeScale;
            return this;
        }
        @CustomType.Setter
        public Builder typeText(String typeText) {
            this.typeText = Objects.requireNonNull(typeText);
            return this;
        }
        public TableColumn build() {
            final var o = new TableColumn();
            o.comment = comment;
            o.name = name;
            o.nullable = nullable;
            o.partitionIndex = partitionIndex;
            o.position = position;
            o.typeIntervalType = typeIntervalType;
            o.typeJson = typeJson;
            o.typeName = typeName;
            o.typePrecision = typePrecision;
            o.typeScale = typeScale;
            o.typeText = typeText;
            return o;
        }
    }
}
