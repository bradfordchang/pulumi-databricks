// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobGitSource {
    /**
     * @return name of the Git branch to use. Conflicts with `tag` and `commit`.
     * 
     */
    private @Nullable String branch;
    /**
     * @return hash of Git commit to use. Conflicts with `branch` and `tag`.
     * 
     */
    private @Nullable String commit;
    /**
     * @return case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
     * 
     */
    private @Nullable String provider;
    /**
     * @return name of the Git branch to use. Conflicts with `branch` and `commit`.
     * 
     */
    private @Nullable String tag;
    /**
     * @return URL of the job on the given workspace
     * 
     */
    private String url;

    private JobGitSource() {}
    /**
     * @return name of the Git branch to use. Conflicts with `tag` and `commit`.
     * 
     */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * @return hash of Git commit to use. Conflicts with `branch` and `tag`.
     * 
     */
    public Optional<String> commit() {
        return Optional.ofNullable(this.commit);
    }
    /**
     * @return case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * @return name of the Git branch to use. Conflicts with `branch` and `commit`.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * @return URL of the job on the given workspace
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobGitSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branch;
        private @Nullable String commit;
        private @Nullable String provider;
        private @Nullable String tag;
        private String url;
        public Builder() {}
        public Builder(JobGitSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commit = defaults.commit;
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
        public JobGitSource build() {
            final var o = new JobGitSource();
            o.branch = branch;
            o.commit = commit;
            o.provider = provider;
            o.tag = tag;
            o.url = url;
            return o;
        }
    }
}
