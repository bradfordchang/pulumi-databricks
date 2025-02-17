// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes Empty = new GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes();

    @Import(name="destination")
    private @Nullable String destination;

    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes() {}

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes(GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumes build() {
            return $;
        }
    }

}
