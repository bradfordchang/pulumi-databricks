// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobJobClusterNewClusterInitScriptAbfssArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobClusterNewClusterInitScriptAbfssArgs Empty = new JobJobClusterNewClusterInitScriptAbfssArgs();

    @Import(name="destination")
    private @Nullable Output<String> destination;

    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    private JobJobClusterNewClusterInitScriptAbfssArgs() {}

    private JobJobClusterNewClusterInitScriptAbfssArgs(JobJobClusterNewClusterInitScriptAbfssArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobClusterNewClusterInitScriptAbfssArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobClusterNewClusterInitScriptAbfssArgs $;

        public Builder() {
            $ = new JobJobClusterNewClusterInitScriptAbfssArgs();
        }

        public Builder(JobJobClusterNewClusterInitScriptAbfssArgs defaults) {
            $ = new JobJobClusterNewClusterInitScriptAbfssArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public JobJobClusterNewClusterInitScriptAbfssArgs build() {
            return $;
        }
    }

}
