// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlDashboardState extends com.pulumi.resources.ResourceArgs {

    public static final SqlDashboardState Empty = new SqlDashboardState();

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="parent")
    private @Nullable Output<String> parent;

    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private SqlDashboardState() {}

    private SqlDashboardState(SqlDashboardState $) {
        this.createdAt = $.createdAt;
        this.name = $.name;
        this.parent = $.parent;
        this.tags = $.tags;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlDashboardState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlDashboardState $;

        public Builder() {
            $ = new SqlDashboardState();
        }

        public Builder(SqlDashboardState defaults) {
            $ = new SqlDashboardState(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public SqlDashboardState build() {
            return $;
        }
    }

}
