# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['LibraryArgs', 'Library']

@pulumi.input_type
class LibraryArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 cran: Optional[pulumi.Input['LibraryCranArgs']] = None,
                 egg: Optional[pulumi.Input[str]] = None,
                 jar: Optional[pulumi.Input[str]] = None,
                 maven: Optional[pulumi.Input['LibraryMavenArgs']] = None,
                 pypi: Optional[pulumi.Input['LibraryPypiArgs']] = None,
                 whl: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Library resource.
        """
        LibraryArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            cran=cran,
            egg=egg,
            jar=jar,
            maven=maven,
            pypi=pypi,
            whl=whl,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             cran: Optional[pulumi.Input['LibraryCranArgs']] = None,
             egg: Optional[pulumi.Input[str]] = None,
             jar: Optional[pulumi.Input[str]] = None,
             maven: Optional[pulumi.Input['LibraryMavenArgs']] = None,
             pypi: Optional[pulumi.Input['LibraryPypiArgs']] = None,
             whl: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_id is None:
            raise TypeError("Missing 'cluster_id' argument")

        _setter("cluster_id", cluster_id)
        if cran is not None:
            _setter("cran", cran)
        if egg is not None:
            _setter("egg", egg)
        if jar is not None:
            _setter("jar", jar)
        if maven is not None:
            _setter("maven", maven)
        if pypi is not None:
            _setter("pypi", pypi)
        if whl is not None:
            _setter("whl", whl)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def cran(self) -> Optional[pulumi.Input['LibraryCranArgs']]:
        return pulumi.get(self, "cran")

    @cran.setter
    def cran(self, value: Optional[pulumi.Input['LibraryCranArgs']]):
        pulumi.set(self, "cran", value)

    @property
    @pulumi.getter
    def egg(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "egg")

    @egg.setter
    def egg(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "egg", value)

    @property
    @pulumi.getter
    def jar(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "jar")

    @jar.setter
    def jar(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "jar", value)

    @property
    @pulumi.getter
    def maven(self) -> Optional[pulumi.Input['LibraryMavenArgs']]:
        return pulumi.get(self, "maven")

    @maven.setter
    def maven(self, value: Optional[pulumi.Input['LibraryMavenArgs']]):
        pulumi.set(self, "maven", value)

    @property
    @pulumi.getter
    def pypi(self) -> Optional[pulumi.Input['LibraryPypiArgs']]:
        return pulumi.get(self, "pypi")

    @pypi.setter
    def pypi(self, value: Optional[pulumi.Input['LibraryPypiArgs']]):
        pulumi.set(self, "pypi", value)

    @property
    @pulumi.getter
    def whl(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "whl")

    @whl.setter
    def whl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "whl", value)


@pulumi.input_type
class _LibraryState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cran: Optional[pulumi.Input['LibraryCranArgs']] = None,
                 egg: Optional[pulumi.Input[str]] = None,
                 jar: Optional[pulumi.Input[str]] = None,
                 maven: Optional[pulumi.Input['LibraryMavenArgs']] = None,
                 pypi: Optional[pulumi.Input['LibraryPypiArgs']] = None,
                 whl: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Library resources.
        """
        _LibraryState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            cran=cran,
            egg=egg,
            jar=jar,
            maven=maven,
            pypi=pypi,
            whl=whl,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             cran: Optional[pulumi.Input['LibraryCranArgs']] = None,
             egg: Optional[pulumi.Input[str]] = None,
             jar: Optional[pulumi.Input[str]] = None,
             maven: Optional[pulumi.Input['LibraryMavenArgs']] = None,
             pypi: Optional[pulumi.Input['LibraryPypiArgs']] = None,
             whl: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']

        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if cran is not None:
            _setter("cran", cran)
        if egg is not None:
            _setter("egg", egg)
        if jar is not None:
            _setter("jar", jar)
        if maven is not None:
            _setter("maven", maven)
        if pypi is not None:
            _setter("pypi", pypi)
        if whl is not None:
            _setter("whl", whl)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def cran(self) -> Optional[pulumi.Input['LibraryCranArgs']]:
        return pulumi.get(self, "cran")

    @cran.setter
    def cran(self, value: Optional[pulumi.Input['LibraryCranArgs']]):
        pulumi.set(self, "cran", value)

    @property
    @pulumi.getter
    def egg(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "egg")

    @egg.setter
    def egg(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "egg", value)

    @property
    @pulumi.getter
    def jar(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "jar")

    @jar.setter
    def jar(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "jar", value)

    @property
    @pulumi.getter
    def maven(self) -> Optional[pulumi.Input['LibraryMavenArgs']]:
        return pulumi.get(self, "maven")

    @maven.setter
    def maven(self, value: Optional[pulumi.Input['LibraryMavenArgs']]):
        pulumi.set(self, "maven", value)

    @property
    @pulumi.getter
    def pypi(self) -> Optional[pulumi.Input['LibraryPypiArgs']]:
        return pulumi.get(self, "pypi")

    @pypi.setter
    def pypi(self, value: Optional[pulumi.Input['LibraryPypiArgs']]):
        pulumi.set(self, "pypi", value)

    @property
    @pulumi.getter
    def whl(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "whl")

    @whl.setter
    def whl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "whl", value)


class Library(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cran: Optional[pulumi.Input[pulumi.InputType['LibraryCranArgs']]] = None,
                 egg: Optional[pulumi.Input[str]] = None,
                 jar: Optional[pulumi.Input[str]] = None,
                 maven: Optional[pulumi.Input[pulumi.InputType['LibraryMavenArgs']]] = None,
                 pypi: Optional[pulumi.Input[pulumi.InputType['LibraryPypiArgs']]] = None,
                 whl: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Installs a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster. Each different type of library has a slightly different syntax. It's possible to set only one type of library within one resource. Otherwise, the plan will fail with an error.

        > **Note** `Library` resource would always start the associated cluster if it's not running, so make sure to have auto-termination configured. It's not possible to atomically change the version of the same library without cluster restart. Libraries are fully removed from the cluster only after restart.

        ## Installing library on all clusters

        You can install libraries on all clusters with the help of get_clusters data resource:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        all = databricks.get_clusters()
        cli = []
        for range in [{"key": k, "value": v} for [k, v] in enumerate(all.ids)]:
            cli.append(databricks.Library(f"cli-{range['key']}",
                cluster_id=range["key"],
                pypi=databricks.LibraryPypiArgs(
                    package="databricks-cli",
                )))
        ```

        ## Java/Scala JAR

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app_dbfs_file = databricks.DbfsFile("appDbfsFile",
            source=f"{path['module']}/app-0.0.1.jar",
            path="/FileStore/app-0.0.1.jar")
        app_library = databricks.Library("appLibrary",
            cluster_id=databricks_cluster["this"]["id"],
            jar=app_dbfs_file.dbfs_path)
        ```

        ## Java/Scala Maven

        Installing artifacts from Maven repository. You can also optionally specify a `repo` parameter for a custom Maven-style repository, that should be accessible without any authentication. Maven libraries are resolved in Databricks Control Plane, so repo should be accessible from it. It can even be properly configured [maven s3 wagon](https://github.com/seahen/maven-s3-wagon), [AWS CodeArtifact](https://aws.amazon.com/codeartifact/) or [Azure Artifacts](https://azure.microsoft.com/en-us/services/devops/artifacts/).

        ```python
        import pulumi
        import pulumi_databricks as databricks

        deequ = databricks.Library("deequ",
            cluster_id=databricks_cluster["this"]["id"],
            maven=databricks.LibraryMavenArgs(
                coordinates="com.amazon.deequ:deequ:1.0.4",
                exclusions=["org.apache.avro:avro"],
            ))
        ```

        ## Python Wheel

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app_dbfs_file = databricks.DbfsFile("appDbfsFile",
            source=f"{path['module']}/baz.whl",
            path="/FileStore/baz.whl")
        app_library = databricks.Library("appLibrary",
            cluster_id=databricks_cluster["this"]["id"],
            whl=app_dbfs_file.dbfs_path)
        ```

        ## Python PyPI

        Installing Python PyPI artifacts. You can optionally also specify the `repo` parameter for a custom PyPI mirror, which should be accessible without any authentication for the network that cluster runs in.

        > **Note** `repo` host should be accessible from the Internet by Databricks control plane. If connectivity to custom PyPI repositories is required, please modify cluster-node `/etc/pip.conf` through databricks_global_init_script.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        fbprophet = databricks.Library("fbprophet",
            cluster_id=databricks_cluster["this"]["id"],
            pypi=databricks.LibraryPypiArgs(
                package="fbprophet==0.6",
            ))
        ```

        ## Python EGG

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app_dbfs_file = databricks.DbfsFile("appDbfsFile",
            source=f"{path['module']}/foo.egg",
            path="/FileStore/foo.egg")
        app_library = databricks.Library("appLibrary",
            cluster_id=databricks_cluster["this"]["id"],
            egg=app_dbfs_file.dbfs_path)
        ```

        ## R CRan

        Installing artifacts from CRan. You can also optionally specify a `repo` parameter for a custom cran mirror.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        rkeops = databricks.Library("rkeops",
            cluster_id=databricks_cluster["this"]["id"],
            cran=databricks.LibraryCranArgs(
                package="rkeops",
            ))
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * get_clusters data to retrieve a list of Cluster ids.
        * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
        * DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        * get_dbfs_file_paths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        * GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all Cluster and databricks_job.
        * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LibraryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Installs a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster. Each different type of library has a slightly different syntax. It's possible to set only one type of library within one resource. Otherwise, the plan will fail with an error.

        > **Note** `Library` resource would always start the associated cluster if it's not running, so make sure to have auto-termination configured. It's not possible to atomically change the version of the same library without cluster restart. Libraries are fully removed from the cluster only after restart.

        ## Installing library on all clusters

        You can install libraries on all clusters with the help of get_clusters data resource:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        all = databricks.get_clusters()
        cli = []
        for range in [{"key": k, "value": v} for [k, v] in enumerate(all.ids)]:
            cli.append(databricks.Library(f"cli-{range['key']}",
                cluster_id=range["key"],
                pypi=databricks.LibraryPypiArgs(
                    package="databricks-cli",
                )))
        ```

        ## Java/Scala JAR

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app_dbfs_file = databricks.DbfsFile("appDbfsFile",
            source=f"{path['module']}/app-0.0.1.jar",
            path="/FileStore/app-0.0.1.jar")
        app_library = databricks.Library("appLibrary",
            cluster_id=databricks_cluster["this"]["id"],
            jar=app_dbfs_file.dbfs_path)
        ```

        ## Java/Scala Maven

        Installing artifacts from Maven repository. You can also optionally specify a `repo` parameter for a custom Maven-style repository, that should be accessible without any authentication. Maven libraries are resolved in Databricks Control Plane, so repo should be accessible from it. It can even be properly configured [maven s3 wagon](https://github.com/seahen/maven-s3-wagon), [AWS CodeArtifact](https://aws.amazon.com/codeartifact/) or [Azure Artifacts](https://azure.microsoft.com/en-us/services/devops/artifacts/).

        ```python
        import pulumi
        import pulumi_databricks as databricks

        deequ = databricks.Library("deequ",
            cluster_id=databricks_cluster["this"]["id"],
            maven=databricks.LibraryMavenArgs(
                coordinates="com.amazon.deequ:deequ:1.0.4",
                exclusions=["org.apache.avro:avro"],
            ))
        ```

        ## Python Wheel

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app_dbfs_file = databricks.DbfsFile("appDbfsFile",
            source=f"{path['module']}/baz.whl",
            path="/FileStore/baz.whl")
        app_library = databricks.Library("appLibrary",
            cluster_id=databricks_cluster["this"]["id"],
            whl=app_dbfs_file.dbfs_path)
        ```

        ## Python PyPI

        Installing Python PyPI artifacts. You can optionally also specify the `repo` parameter for a custom PyPI mirror, which should be accessible without any authentication for the network that cluster runs in.

        > **Note** `repo` host should be accessible from the Internet by Databricks control plane. If connectivity to custom PyPI repositories is required, please modify cluster-node `/etc/pip.conf` through databricks_global_init_script.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        fbprophet = databricks.Library("fbprophet",
            cluster_id=databricks_cluster["this"]["id"],
            pypi=databricks.LibraryPypiArgs(
                package="fbprophet==0.6",
            ))
        ```

        ## Python EGG

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app_dbfs_file = databricks.DbfsFile("appDbfsFile",
            source=f"{path['module']}/foo.egg",
            path="/FileStore/foo.egg")
        app_library = databricks.Library("appLibrary",
            cluster_id=databricks_cluster["this"]["id"],
            egg=app_dbfs_file.dbfs_path)
        ```

        ## R CRan

        Installing artifacts from CRan. You can also optionally specify a `repo` parameter for a custom cran mirror.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        rkeops = databricks.Library("rkeops",
            cluster_id=databricks_cluster["this"]["id"],
            cran=databricks.LibraryCranArgs(
                package="rkeops",
            ))
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * get_clusters data to retrieve a list of Cluster ids.
        * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
        * DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        * get_dbfs_file_paths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        * GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all Cluster and databricks_job.
        * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param LibraryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LibraryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            LibraryArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cran: Optional[pulumi.Input[pulumi.InputType['LibraryCranArgs']]] = None,
                 egg: Optional[pulumi.Input[str]] = None,
                 jar: Optional[pulumi.Input[str]] = None,
                 maven: Optional[pulumi.Input[pulumi.InputType['LibraryMavenArgs']]] = None,
                 pypi: Optional[pulumi.Input[pulumi.InputType['LibraryPypiArgs']]] = None,
                 whl: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LibraryArgs.__new__(LibraryArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            cran = _utilities.configure(cran, LibraryCranArgs, True)
            __props__.__dict__["cran"] = cran
            __props__.__dict__["egg"] = egg
            __props__.__dict__["jar"] = jar
            maven = _utilities.configure(maven, LibraryMavenArgs, True)
            __props__.__dict__["maven"] = maven
            pypi = _utilities.configure(pypi, LibraryPypiArgs, True)
            __props__.__dict__["pypi"] = pypi
            __props__.__dict__["whl"] = whl
        super(Library, __self__).__init__(
            'databricks:index/library:Library',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            cran: Optional[pulumi.Input[pulumi.InputType['LibraryCranArgs']]] = None,
            egg: Optional[pulumi.Input[str]] = None,
            jar: Optional[pulumi.Input[str]] = None,
            maven: Optional[pulumi.Input[pulumi.InputType['LibraryMavenArgs']]] = None,
            pypi: Optional[pulumi.Input[pulumi.InputType['LibraryPypiArgs']]] = None,
            whl: Optional[pulumi.Input[str]] = None) -> 'Library':
        """
        Get an existing Library resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LibraryState.__new__(_LibraryState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["cran"] = cran
        __props__.__dict__["egg"] = egg
        __props__.__dict__["jar"] = jar
        __props__.__dict__["maven"] = maven
        __props__.__dict__["pypi"] = pypi
        __props__.__dict__["whl"] = whl
        return Library(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def cran(self) -> pulumi.Output[Optional['outputs.LibraryCran']]:
        return pulumi.get(self, "cran")

    @property
    @pulumi.getter
    def egg(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "egg")

    @property
    @pulumi.getter
    def jar(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "jar")

    @property
    @pulumi.getter
    def maven(self) -> pulumi.Output[Optional['outputs.LibraryMaven']]:
        return pulumi.get(self, "maven")

    @property
    @pulumi.getter
    def pypi(self) -> pulumi.Output[Optional['outputs.LibraryPypi']]:
        return pulumi.get(self, "pypi")

    @property
    @pulumi.getter
    def whl(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "whl")

