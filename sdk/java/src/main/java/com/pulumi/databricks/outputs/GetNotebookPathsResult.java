// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetNotebookPathsNotebookPathList;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNotebookPathsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return list of objects with `path` and `language` attributes
     * 
     */
    private List<GetNotebookPathsNotebookPathList> notebookPathLists;
    private String path;
    private Boolean recursive;

    private GetNotebookPathsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return list of objects with `path` and `language` attributes
     * 
     */
    public List<GetNotebookPathsNotebookPathList> notebookPathLists() {
        return this.notebookPathLists;
    }
    public String path() {
        return this.path;
    }
    public Boolean recursive() {
        return this.recursive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotebookPathsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetNotebookPathsNotebookPathList> notebookPathLists;
        private String path;
        private Boolean recursive;
        public Builder() {}
        public Builder(GetNotebookPathsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.notebookPathLists = defaults.notebookPathLists;
    	      this.path = defaults.path;
    	      this.recursive = defaults.recursive;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder notebookPathLists(List<GetNotebookPathsNotebookPathList> notebookPathLists) {
            this.notebookPathLists = Objects.requireNonNull(notebookPathLists);
            return this;
        }
        public Builder notebookPathLists(GetNotebookPathsNotebookPathList... notebookPathLists) {
            return notebookPathLists(List.of(notebookPathLists));
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder recursive(Boolean recursive) {
            this.recursive = Objects.requireNonNull(recursive);
            return this;
        }
        public GetNotebookPathsResult build() {
            final var o = new GetNotebookPathsResult();
            o.id = id;
            o.notebookPathLists = notebookPathLists;
            o.path = path;
            o.recursive = recursive;
            return o;
        }
    }
}