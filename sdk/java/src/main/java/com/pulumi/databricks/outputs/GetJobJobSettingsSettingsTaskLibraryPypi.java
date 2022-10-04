// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskLibraryPypi {
    private String package_;
    private @Nullable String repo;

    private GetJobJobSettingsSettingsTaskLibraryPypi() {}
    public String package_() {
        return this.package_;
    }
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskLibraryPypi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String package_;
        private @Nullable String repo;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskLibraryPypi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.package_ = defaults.package_;
    	      this.repo = defaults.repo;
        }

        @CustomType.Setter("package")
        public Builder package_(String package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {
            this.repo = repo;
            return this;
        }
        public GetJobJobSettingsSettingsTaskLibraryPypi build() {
            final var o = new GetJobJobSettingsSettingsTaskLibraryPypi();
            o.package_ = package_;
            o.repo = repo;
            return o;
        }
    }
}
