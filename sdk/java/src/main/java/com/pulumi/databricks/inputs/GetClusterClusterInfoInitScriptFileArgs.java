// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoInitScriptFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetClusterClusterInfoInitScriptFileArgs Empty = new GetClusterClusterInfoInitScriptFileArgs();

    @Import(name="destination")
    private @Nullable Output<String> destination;

    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    private GetClusterClusterInfoInitScriptFileArgs() {}

    private GetClusterClusterInfoInitScriptFileArgs(GetClusterClusterInfoInitScriptFileArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoInitScriptFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoInitScriptFileArgs $;

        public Builder() {
            $ = new GetClusterClusterInfoInitScriptFileArgs();
        }

        public Builder(GetClusterClusterInfoInitScriptFileArgs defaults) {
            $ = new GetClusterClusterInfoInitScriptFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public GetClusterClusterInfoInitScriptFileArgs build() {
            return $;
        }
    }

}
