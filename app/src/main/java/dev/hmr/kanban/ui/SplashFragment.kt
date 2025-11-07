package dev.hmr.kanban.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.hmr.kanban.R
import dev.hmr.kanban.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    /**
     *     Essa abordagem permite que o "biding" seja explicitamente
     * instanciado e funcional. É um padrão de nomenclatura de variável.*/
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        this._binding = FragmentSplashBinding.inflate(inflater, container, false)
        return this.binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this._binding = null
    }


}