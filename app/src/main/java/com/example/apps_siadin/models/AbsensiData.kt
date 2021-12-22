package com.example.apps_siadin.models

class AbsensiData(
    klmpk_bjr : String?,
    nm_mtkl : String?,
    nm_dsn : String?,
    nid_dns : String?,
    jns_mtkl : String?,
    sks : Int?
) {
    private var klmpk_bjr: String
    init {
        this.klmpk_bjr = klmpk_bjr!!
    }

    fun getKlmpkBjr() : String? {
        return klmpk_bjr
    }

    fun setlmpkBjr(klmpk_bjr: String?){
        this.klmpk_bjr = klmpk_bjr!!
    }

    private var nm_mtkl : String
    init {
        this.nm_mtkl = nm_mtkl!!
    }

    fun getNmMtkl() : String? {
        return nm_mtkl
    }

    fun setNmMtkl(nm_mtkl: String?) {
        this.nm_mtkl = nm_mtkl!!
    }

    private var nm_dsn : String
    init {
        this.nm_dsn = nm_dsn!!
    }

    fun getNmDsn() : String? {
        return nm_dsn
    }

    fun setNmDsn(nm_dsn: String?) {
        this.nm_dsn = nm_dsn!!
    }

    private var nid_dns : String
    init {
        this.nid_dns = nid_dns!!
    }

    fun getNidDns() : String? {
        return nid_dns
    }

    fun setNidDns(nid_dns: String?) {
        this.nid_dns = nid_dns!!
    }

    private var jns_mtkl : String
    init {
        this.jns_mtkl = jns_mtkl!!
    }

    fun getJnsMtkl() : String? {
        return jns_mtkl
    }

    fun setJnsMtkl(jns_mtkl: String?) {
        this.jns_mtkl = jns_mtkl!!
    }

    private var sks : Int
    init {
        this.sks = sks!!
    }

    fun getSks() : Int? {
        return sks
    }

    fun setSks(sks: Int?) {
        this.sks = sks!!
    }
}