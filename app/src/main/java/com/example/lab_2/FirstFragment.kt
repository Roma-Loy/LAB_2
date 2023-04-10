package com.example.lab_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab_2.databinding.MoviesListBinding

class FirstFragment : Fragment() {

    lateinit var adapter: FirstAdapter
    lateinit var binding: MoviesListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = MoviesListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FirstAdapter { movieData, _ ->
            findNavController().navigate(FirstFragmentDirections.FirstToSecond(movieData))
        }
        adapter.setNewData(createMovie())
        binding.rv.adapter = adapter

    }

    fun createMovie(): List<MovieData> {
        return listOf(
            MovieData(
                "Одні з нас (2023)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/69loIrm9JPpPRE3Akw4yRoitSYn.jpg",
                "<b>Жанр:</b> драма, фантастика, трилер<br><b>Сезони:</b> 1<br><b>Світова прем'єра:</b> 15 січня 2023",
                "Дія серіалу розвивається через 20 років після знищення сучасної цивілізації через пандемію. Контрабандист Джоел наймається вивезти Еллі – 14-річну дівчинку – з карантинної зони. Те, що починається як непильна робота, незабаром перетворюється на жорстоку і несамовиту подорож, протягом якої Джоелу та Еллі доведеться навчитися довіряти один одному.",
                "https://www.hbo.com/the-last-of-us"
            ),
            MovieData(
                "Мандалорець (2019)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eExI910zssvRvKgXMqn7qRMFZ9Q.jpg",
                "<b>Жанр:</b> фентезі, фантастика<br><b>Сезони:</b> 3<br><b>Світова прем'єра:</b> 12 листопада 2019",
                "Похмурий воїн-мандалорець, що ніколи не знімає шолом, працює найманцем і майже всі заощадження віддає своїм родичам, які колись були великою расою, тепер ховаються під землею і тихо відновлюють колишню славу. На одному з особливо дорогих завдань грізний колишній імперець доручає Мандалорцю доставити живим чи мертвим якесь істота. Їм виявляється маленька мила істота, і герой - розуміючи, що нічого хорошого з цим Малюк робити клієнт не збирається, - починає нелегку боротьбу з власною совістю.",
                "https://www.disneyplus.com/series/the-mandalorian/3jLIGMDYINqD?distributionPartner=google"
            ),
            MovieData(
                "Джіні та Джорджія (2021)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rUPRDMVQGPh8y6SEN5h1iMv0Ghh.jpg",
                "<b>Жанр:</b> драма, комедія<br><b>Сезони:</b> 2<br><b>Світова прем'єра:</b> 15 лютого 2023",
                "Вільнодумна Джорджія переїжджає з двома дітьми, Джіні та Остіном, на північ, щоб почати життя з чистого аркуша, але дорога до змін не така легка.",
                "https://www.netflix.com/title/81025696?source=35"
            ),
            MovieData(
                "Тінь та кістка (2021)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zMxOK6oRAPATW6vWzvkVfqcq98x.jpg",
                "<b>Жанр:</b> драма, фентезі, бойовик<br><b>Сезони:</b> 2<br><b>Світова прем'єра:</b> 23 квітня 2021 року",
                "У світі, поділеному на дві частини масивним бар'єром вічної темряви, де неприродні істоти живляться людським тілом, молодий солдат розкриває силу, яка може нарешті об'єднати її країну. Але коли вона бореться за свою владу, проти неї будують змови небезпечні сили. Бандити, злодії, вбивці та святі зараз у стані війни, і для виживання потрібно більше, ніж магія.",
                "https://www.netflix.com/title/80236319?source=35"
            ),
        )
    }
}