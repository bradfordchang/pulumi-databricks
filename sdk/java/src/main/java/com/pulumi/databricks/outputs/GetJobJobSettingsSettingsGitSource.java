// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsGitSourceJobSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsGitSource {
    private @Nullable String branch;
    private @Nullable String commit;
    private @Nullable GetJobJobSettingsSettingsGitSourceJobSource jobSource;
    private @Nullable String provider;
    private @Nullable String tag;
    private String url;

    private GetJobJobSettingsSettingsGitSource() {}
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    public Optional<String> commit() {
        return Optional.ofNullable(this.commit);
    }
    public Optional<GetJobJobSettingsSettingsGitSourceJobSource> jobSource() {
        return Optional.ofNullable(this.jobSource);
    }
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsGitSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branch;
        private @Nullable String commit;
        private @Nullable GetJobJobSettingsSettingsGitSourceJobSource jobSource;
        private @Nullable String provider;
        private @Nullable String tag;
        private String url;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsGitSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commit = defaults.commit;
    	      this.jobSource = defaults.jobSource;
    	      this.provider = defaults.provider;
    	      this.tag = defaults.tag;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder commit(@Nullable String commit) {
            this.commit = commit;
            return this;
        }
        @CustomType.Setter
        public Builder jobSource(@Nullable GetJobJobSettingsSettingsGitSourceJobSource jobSource) {
            this.jobSource = jobSource;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetJobJobSettingsSettingsGitSource build() {
            final var _resultValue = new GetJobJobSettingsSettingsGitSource();
            _resultValue.branch = branch;
            _resultValue.commit = commit;
            _resultValue.jobSource = jobSource;
            _resultValue.provider = provider;
            _resultValue.tag = tag;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
